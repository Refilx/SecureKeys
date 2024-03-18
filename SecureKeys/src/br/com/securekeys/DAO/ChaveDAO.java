package br.com.securekeys.DAO;

import br.com.securekeys.model.Chave;
import br.com.securekeys.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChaveDAO {

    /**
     * O método executa o INSERT no banco de dados
     */
        public void save(Chave chave) {

        String sql = "INSERT INTO chaves(sala, quantChave, status) VALUES (?, ?, ?)";

        Connection conn = null;

        PreparedStatement pstm = null;


        try{
            //Cria conexão com o banco
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Adicionar os valores que são esperados pela Query
            pstm.setString(1, chave.getSala());
            pstm.setInt(2, chave.getQuantChave());
            pstm.setString(3, chave.getStatus());

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
    public List<Chave> getChave() {
        String sql = "SELECT * FROM chaves";

        List<Chave> listaChave = new ArrayList<Chave>();

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
                Chave chave = new Chave();

                //Recupera o número da chave
                chave.setNumeroChave(rset.getInt("numeroChave"));

                //Recupera a sala da chave
                chave.setSala(rset.getString("sala"));

                //Recupera a quantidade da respectiva chave
                chave.setQuantChave(rset.getInt("quantChave"));

                //Recupera o status da chave
                chave.setStatus(rset.getString("status"));

                //Adiciona a chave com todos os dados registrados à lista de chaves
                listaChave.add(chave);
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

        return listaChave;
    }

    /**
     * O método executa o comando UPDATE no banco de dados
     */
    public void update(Chave chave){

        String sql = "UPDATE chaves SET sala = ?, quantChave = ?, status = ?"+
                     "WHERE numeroChave = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Adicina os valores para atualizar
            pstm.setString(1,chave.getSala());
            pstm.setInt(2, chave.getQuantChave());
            pstm.setString(3, chave.getStatus());

            //Qual o ID do registro que deseja atualizar?
            pstm.setInt(4, chave.getNumeroChave());

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
    public void deleteByID(int numeroChave){

        String sql = "DELETE FROM chaves WHERE numeroChave = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Passando o id do registro que será excluído
            pstm.setInt(1, numeroChave);

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
     * emprestar a chave:
     *
     * update chaves set quantchave = quantchave - 1 where numerochave = tal
     *
     *
     * devolver chave:
     *
     * update chaves set quantchave = quantchave + 1 where numerochave = tal
     */
}
