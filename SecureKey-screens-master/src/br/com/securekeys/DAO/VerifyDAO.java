package br.com.securekeys.DAO;

import br.com.securekeys.factory.ConnectionFactory;
import br.com.securekeys.model.Chave;
import br.com.securekeys.model.Logs;
import br.com.securekeys.model.Usuario;
import org.jasypt.util.password.BasicPasswordEncryptor;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VerifyDAO {

    /**
     *  O método verifica se existe um username no banco de dados identico ao informado no parâmetro
     * @param username
     * @return
     */
    public boolean verifyUsername(String username) {

        String sql = "SELECT username FROM usuario";

        //
        boolean resultadoVerify = true;

        Connection conn = null;

        //
        PreparedStatement pstm = null;

        //
        ResultSet rset = null;

        try{
            //
            conn = ConnectionFactory.createConnectionToMySQL();

            //
            pstm = conn.prepareStatement(sql);

            //
            rset = pstm.executeQuery();

            //
            while (rset.next()){
                //
                String userDoBanco = rset.getString("username");

                //
                if(username.equalsIgnoreCase(userDoBanco)){
                    resultadoVerify = false;
                    break;
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                //
                if(rset!=null){
                    rset.close();
                }

                if(pstm!=null){
                    pstm.close();
                }

                if(conn!=null){
                    conn.close();
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return resultadoVerify;
    }

    /**
     * O método abaixo verifica se a role do ultimo usuário que realizou o login é um Administrador
     * @return
     */
    public boolean verifySuperUser() {

        String sql = "SELECT * FROM ultimo_logado";

        boolean resultadoVerify = false;

        Connection conn = null;

        PreparedStatement pstm = null;

        ResultSet rset = null;

        try{
            //
            conn = ConnectionFactory.createConnectionToMySQL();

            //
            pstm = conn.prepareStatement(sql);

            //
            rset = pstm.executeQuery();

            //
            rset.next();

            //
            String role = rset.getString("role");

            if(role.equalsIgnoreCase("Administrador")){
                resultadoVerify = true;
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                //
                if(rset!=null){
                    rset.close();
                }

                if(pstm!=null){
                    pstm.close();
                }

                if(conn!=null){
                    conn.close();
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return resultadoVerify;
    }

    /**
     *  O método verifica se existe um CPF no banco de dados identico ao informado no parâmetro
     * @param cpf
     * @return
     */
    public boolean verifyCPF(String cpf) {

        String sql = "SELECT cpf FROM pessoa";

        //
        boolean resultadoVerify = true;

        Connection conn = null;

        //
        PreparedStatement pstm = null;

        //
        ResultSet rset = null;

        try{
            //
            conn = ConnectionFactory.createConnectionToMySQL();

            //
            pstm = conn.prepareStatement(sql);

            //
            rset = pstm.executeQuery();

            //
            while (rset.next()){
                //
                String cpfDoBanco = rset.getString("cpf");

                //
                if(cpf.equalsIgnoreCase(cpfDoBanco)){
                    resultadoVerify = false;
                    break;
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                //
                if(rset!=null){
                    rset.close();
                }

                if(pstm!=null){
                    pstm.close();
                }

                if(conn!=null){
                    conn.close();
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return resultadoVerify;

    }

    /**
     * O método abaixo valida a senha que será passada pelo usuário ao tentar fazer login
     * @param user
     * @param pass
     * @return
     */
    public boolean verifyPass(String user, String pass){

        String sql = "SELECT idUser, password FROM usuario WHERE username = ?";

        boolean resultadoValidacao = false;

        Connection conn = null;

        PreparedStatement pstm = null;

        // Classe que vai recuperar os dados do banco.  *** SELECT ***
        ResultSet rset = null;

        try{
            //Cria conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Atribui a query o username que será buscado no banco
            pstm.setString(1, user);

            rset = pstm.executeQuery();

            while(rset.next()){

                //Criamos um usuário
                Usuario usuario = new Usuario();

                //Inicializamos o encriptador
                BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();

                //Armazenamos o username do usuário que está logando para verificar se ele está cadastrados no banco de daods
//                usuario.setUsername(rset.getString("username"));

                //Se o nome do usuário existir no banco de dados passaremos a verificar se a senha está correta
//                if(user.equals(usuario.getUsername())){

                //Neste ponto pegamos a senha do respectivo usuário cadatrado no banco de dados
                usuario.setPassword(rset.getString("password"));

                /**
                 Verificamos se a senha digitada pelo usuário na tela de login (que será passada como parâmetro do método)
                 utilizando a classe de criptografia de dados para comparar com  senha criptografada do usuário guardada no banco de dados

                 se a senha estiver correta, validamos o login
                 e armazenamos o usuário que fez login pegando o id do respectivo usuário
                 */
                if(passwordEncryptor.checkPassword(pass, usuario.getPassword())){
                    //Armazenamos o id do respectivo usuário
                    usuario.setIdUser(rset.getInt("idUser"));

                    //Criamos neste ponto as classes que irão armazenar os dados do usuário que está acessando
                    LogsDAO logsDAO = new LogsDAO();
                    Logs logs = new Logs();

                    //Armazenamos o idUser e a data do log no objeto log e salvamos no banco de dados
                    logs.setIdUser(usuario.getIdUser());

                    logsDAO.saveLogin(logs);

                    resultadoValidacao = true;
//                        break;
                }
//                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {

            try{
                //
                if(rset!=null){
                    rset.close();
                }

                if(pstm!=null){
                    pstm.close();
                }

                if(conn!=null){
                    conn.close();
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return resultadoValidacao;
    }

    /**
     * Método de verify do status da chave
     */
    public boolean verifyStatusChave(int idChave){

        String sql = "SELECT status, observacoes, quantChave FROM chaves WHERE idChave = ?";

        boolean resultadoVerify = false;

        Connection conn = null;

        PreparedStatement pstm = null;

        ResultSet rset = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //
            pstm.setInt(1, idChave);

            //
            rset = pstm.executeQuery();

            //
            rset.next();

            //
            Chave chave = new Chave();

            //Variável que armazenará as observacoes da chave (chave principal ou chave reserva) armazenada no banco de dados
            chave.setObservacoes(rset.getString("observacoes"));

            //Variável que armazenará o valor do status da chave armazenada no banco de dados
            chave.setStatus(rset.getString("status"));

            //Variável que armazenará a quantidade de chaves que estarão na portaria no momento em que for realizado o emprestimo
            chave.setQuantChave(rset.getInt("quantChave"));

            //Se o status da chave for disponível, a quantidade for maior que 0 (zero) e não for uma chave reserva, o resultado recebe um valor true
            if (
                    chave.getQuantChave() > 0 &&
                            chave.getStatus().equalsIgnoreCase("DISPONÍVEL") &&
                            !chave.getObservacoes().equalsIgnoreCase("Chave Reserva")
            ) {
                resultadoVerify = true;
            }
            //Tratamento de chaves com a quantidade igual a 0 (zero)
            else if (chave.getQuantChave() == 0) {
                //
                ChaveDAO chaveDAO = new ChaveDAO();

                //
                chaveDAO.updateStatusChave(idChave);
            }
            //Tratamento de emprestimo de chave reserva
            else if(chave.getObservacoes().equalsIgnoreCase("Chave Reserva")){

                //Mensagem de confirmação de emprestimo de chave reserva
                int opcao = JOptionPane.showOptionDialog(null, "Você está emprestando uma Chave RESERVA! \n Tem certeza que deseja continuar?",
                        "Chave Reserva Identificada", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Sim", "Não"}, null );

                if(opcao == 0){
                    resultadoVerify = true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "A Chave NÃO foi emprestada!",
                            "Cancelado!", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{

                //Fechar as conexões que foram abertas
                if(rset!=null){
                    rset.close();
                }

                if(pstm!=null){
                    pstm.close();
                }

                if(conn!=null) {
                    conn.close();
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return resultadoVerify;
    }

}
