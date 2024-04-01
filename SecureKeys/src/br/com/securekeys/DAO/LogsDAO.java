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
import org.jasypt.util.password.BasicPasswordEncryptor;

public class LogsDAO {

    /**
     * O método executa o INSERT no banco de dados
     */
    public void save(Logs logs) {

        String sql = "INSERT INTO logs(idUser, dtLogs) VALUES (?, ?)";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria conexão com o banco
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Adicionar os valores que são esperados pela Query
            pstm.setInt(1, logs.getIdUser());
            pstm.setDate(2, new Date(logs.getDtLog().getTime()));

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
        String sql = "SELECT L.*, U.username FROM logs L"+
                     "JOIN usuario U ON(L.idUser = U.idUser)"; //Verificar se vai dar certo

//        String sql = "SELECT * FROM logs";

        //Lista que armazenará os dados de logs
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

                //Recupera o idLogs da logs
                logs.setIdLogs(rset.getInt("idLogs"));

                //Recupera o idUser da logs
                logs.setIdUser(rset.getInt("idUser"));

                //Recupera o username da consulta
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
//                "WHERE idLogs = ?";


//        String sql = "UPDATE logs SET idUser = ?, username = ?, DtLogs = ?"+
//                "WHERE idLogs = ?";

        String sql = "UPDATE logs SET idUser = ?"+
                     "WHERE idLogs = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Adicina os valores para atualizar
            pstm.setInt(1,logs.getIdUser());
//            pstm.setDate(, new Date(logs.getDtLog().getTime()));

            //Qual o ID do registro que deseja atualizar?
            pstm.setInt(2, logs.getIdLogs());

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
    public void deleteByID(int idLogs){

        String sql = "DELETE FROM logs WHERE idLogs = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Passando o id do registro que será excluído
            pstm.setInt(1, idLogs);

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
                        logs.setDtLog(new java.util.Date());

                        logsDAO.save(logs);

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

}
