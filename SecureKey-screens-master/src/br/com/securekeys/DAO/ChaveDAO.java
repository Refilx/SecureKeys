package br.com.securekeys.DAO;

import br.com.securekeys.model.Chave;
import br.com.securekeys.factory.ConnectionFactory;
import br.com.securekeys.model.Historico;

import javax.swing.*;
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

        String sql = "INSERT INTO chaves(numeroChave, sala, observacoes, quantChave, status, bloco_predio) VALUES (?, ?, ?, ?, ?, ?)";

        Connection conn = null;

        PreparedStatement pstm = null;


        try{
            //Cria conexão com o banco
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Adicionar os valores que são esperados pela Query
            pstm.setInt(1, chave.getNumeroChave());
            pstm.setString(2, chave.getSala());
            pstm.setString(3, chave.getObservacoes());
            pstm.setInt(4, chave.getQuantChave());
            pstm.setString(5, chave.getStatus());
            pstm.setString(6, chave.getBloco());

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

                //Recupera o id da chave
                chave.setIdChave(rset.getInt("idChave"));

                //Recupera o número da chave
                chave.setNumeroChave(rset.getInt("numeroChave"));

                //Recupera a sala da chave
                chave.setSala(rset.getString("sala"));

                //Recupera o Bloco/Predio que pertence a chave
                chave.setBloco(rset.getString("bloco_predio"));

                //Recupera as observações da chave
                chave.setObservacoes(rset.getString("observacoes"));

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

        String sql = "UPDATE chaves SET numeroChave = ?, sala = ?, observacoes = ?, quantChave = ?, status = ?, bloco-predio = ? WHERE idChave = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Adicina os valores para atualizar
            pstm.setInt(1, chave.getNumeroChave());
            pstm.setString(2,chave.getSala());
            pstm.setString(3, chave.getObservacoes());
            pstm.setInt(4, chave.getQuantChave());
            pstm.setString(5, chave.getStatus());
            pstm.setString(6, chave.getBloco());

            //Qual o ID do registro que deseja atualizar?
            pstm.setInt(7, chave.getIdChave());

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
    public void deleteByID(int idChave){

        String sql = "DELETE FROM chaves WHERE idChave = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Passando o id do registro que será excluído
            pstm.setInt(1, idChave);

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
     *
     * @param idChave
     */
    public void updateStatusChave(int idChave){

        String sql = "UPDATE chaves SET status = 'INDISPONÍVEL' WHERE idChave = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //
            pstm.setInt(1, idChave);

            //
            pstm.execute();

        }catch(Exception e){
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
     * Método para emprestar a chave
     *
     * verificar a classe de parâmetro para salvar o emprestimo no histórico
     */
    public void emprestarChave(Historico historico){

        VerifyDAO verifyDAO = new VerifyDAO();
        //
        if(verifyDAO.verifyStatusChave(historico.getIdChave())){

            String sql = "UPDATE chaves SET quantChave = quantChave - 1 WHERE idChave = ?";

            HistoricoDAO historicoDAO = new HistoricoDAO();

            Connection conn = null;

            PreparedStatement pstm = null;

            try{
                //Cria a conexão com o banco de dados
                conn = ConnectionFactory.createConnectionToMySQL();

                //Criamos uma PreparedStatement para executar uma query
                pstm = conn.prepareStatement(sql);

                //
                pstm.setInt(1, historico.getIdChave());

                //Executa a Query
                pstm.execute();

                //Após executar a query que realiza o empréstimo da chave, salvamos a transação no histórico
                historicoDAO.save(historico);

            }catch(Exception e){
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
        else{

            //Mensagem de erro ao tentar emprestar a chave, estando ela indisponível
            JOptionPane.showMessageDialog(null, "Você não pode emprestar esta chave, pois ela está INDISPONÍVEL!",
                    "ERRO AO EMPRESTAR CHAVE!", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Verificar usabilidade desse método de devolução e do método de updateDataFechamento do HistoricoDAO
     * @param historico
     */
    public void devolverChave(Historico historico){

        String sqlUpdate = "UPDATE chaves SET quantChave = quantChave + 1, status = 'DISPONIVEL' WHERE idChave = ?";

        Connection connUpdate = null;

        PreparedStatement pstmUpdate = null;

        try{
            //
            connUpdate = ConnectionFactory.createConnectionToMySQL();

            //
            pstmUpdate = connUpdate.prepareStatement(sqlUpdate);

            //
            pstmUpdate.setInt(1, historico.getIdChave());

            //
            boolean result = pstmUpdate.execute();

            //Se result realizar um UPDATE o retorno é false, logo precisamos testar se o retorno é falso para salvar o histórico
            if(!result){
                //
                HistoricoDAO historicoDAO = new HistoricoDAO();

                historicoDAO.updateDataFechamento(historico);
            }
            else{
                System.out.println("Não deu update no histórico");
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                //
                if(pstmUpdate!=null){
                    pstmUpdate.close();
                }

                if(connUpdate!=null){
                    connUpdate.close();
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }


    }
}
