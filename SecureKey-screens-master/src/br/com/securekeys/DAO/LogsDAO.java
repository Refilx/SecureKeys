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
     * Criar método loginRegister e logoutRegister na LogsDAO
     * O primeiro vai registrar o login do usuário ao realizar o login
     * O segundo vai registrar o logout do usuário ao sair
     */

}
