package br.com.securekeys.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.securekeys.factory.ConnectionFactory;
import br.com.securekeys.model.Logs;
import br.com.securekeys.model.Usuario;

public class LogsDAO {

    /**
     * O método executa o INSERT no banco de dados
     *
     * verificar se o código está correto
     */
    public void save(Logs logs) {

        String sql = "INSERT INTO logs(idUser, username, dtLogs) VALUES (?, ?, ?)";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria conexão com o banco
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Adicionar os valores que são esperados pela Query
            pstm.setInt(1, logs.getIdUser());
            pstm.setString(2, logs.getUsername());
            pstm.setDate(3, new Date(logs.getDtLog().getTime()));

            //Executa a Query
            pstm.execute();

        }catch(Exception e) {
            e.printStackTrace();
        }finally{

            //Fecha as conexões que foram abertas com o banco de dados
            try{
                if(pstm!=null){
                    pstm.close();
                }

                if(conn!=null){
                    conn.close();
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    //O método executa o READ no banco de dados
    public List<Logs> getLogs() {
//        String sql = "SELECT L.*, U.username FROM logs L"+
//                     "JOIN usuario U ON(L.idUser = U.idUser)"; //Verificar se vai dar certo

        String sql = "SELECT * FROM logs";

        List<Logs> listaLogs = new ArrayList<Logs>();

        Connection conn = null;

        PreparedStatement pstm = null;

        // Classe que vai recuperar os dados do banco.  *** SELECT ***
        ResultSet rset = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto houver um próximo dado para ser armazenado pelo ResultSet, os comandos serão executados
            while(rset.next()){
                Logs logs = new Logs();

                //Recupera o id da logs
                logs.setIdUser(rset.getInt("idUser"));

                //Recupera o id da logs
                logs.setUsername(rset.getString("username"));

                //Recupera a data do logs
                logs.setDtLog(rset.getDate("dtLogs"));

                //Adiciona a logs com todos os dados registrados à lista de chaves
                listaLogs.add(logs);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{

            try{
                //Fecha as conexões que foram abertas com o banco de dados
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

        return listaLogs;
    }

    /**
     * O método executa o comando UPDATE no banco de dados
     */
    public void update(Logs logs){

//        String sql = "UPDATE logs SET idUser = ?, DtLogs = ?"+
//                "WHERE idUser = ?";


//        String sql = "UPDATE logs SET idUser = ?, username = ?, DtLogs = ?"+
//                "WHERE idUser = ?";

        String sql = "UPDATE logs SET idUser = ?, username = ?"+
                     "WHERE idUser = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Adicina os valores para atualizar
            pstm.setInt(1,logs.getIdUser());
            pstm.setString(2, logs.getUsername());
//            pstm.setDate(, new Date(logs.getDtLog().getTime()));

            //Qual o ID do registro que deseja atualizar?
            pstm.setInt(3, logs.getIdUser());

            //Executa a Query
            pstm.execute();

        }catch(Exception e) {
            e.printStackTrace();
        }finally{
            try{

                //Fechar as conexões que foram abertas
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
    }

    /**
     *  O método executa o comando DELETE no banco de dados
     */
    public void deleteByID(int idUser){

        String sql = "DELETE FROM logs WHERE idUser = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Passando o id do registro que será excluído
            pstm.setInt(1, idUser);

            //Executa a Query
            pstm.execute();

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            try{
                //Fechar as conexões que foram abertas
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
    }

    /**
     * O método abaixo valida a senha que será passada pelo usuário ao tentar fazer login
     * @param pass
     * @return
     */
    public boolean verifyPass(String pass){

        String sql = "SELECT password FROM usuario";

        Boolean resultadoValidacao = false;

        Connection conn = null;

        PreparedStatement pstm = null;

        // Classe que vai recuperar os dados do banco.  *** SELECT ***
        ResultSet rset = null;

        try{
            //Cria conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while(rset.next()){

                //Criamos um usuário
                Usuario usuario = new Usuario();

                //Neste ponto pegamos a senha de algum usuário do banco de dados e armazenamos no usuário recém criado
                usuario.setPassword(rset.getString("password"));

                /**
                     Verificamos se a senha digitada pelo usuário na tela de login (que será passada como parâmetro do método)
                     e comparamos com a senha de um usuário guardada no banco de dados

                     se a senha estiver correta, validamos o login
                     e armazenamos o usuário que fez login pegando o nome do usuário digitado na tela de login
                 */
                if(pass.equals(usuario.getPassword())){
                    resultadoValidacao = true;
                    break;
                }
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

}
