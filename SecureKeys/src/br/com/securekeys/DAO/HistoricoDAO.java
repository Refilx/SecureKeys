package br.com.securekeys.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.securekeys.factory.ConnectionFactory;
import br.com.securekeys.model.Historico;

public class HistoricoDAO {

    /**
     *
     * @param historico
     */
    public void save(Historico historico){

        String sql = "INSERT INTO historico(nome, numeroChave, observacoes, status, dataAbertura) VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //
            conn = ConnectionFactory.createConnectionToMySQL();

            //
            pstm = conn.prepareStatement(sql);

            //
            pstm.setString(1, historico.getNome());
            pstm.setInt(2, historico.getNumeroChave());
            pstm.setString(3, historico.getObservacoes());
            pstm.setString(4, historico.getStatus());
            pstm.setDate(5, new Date(historico.getDataAbertura().getTime()));

            //
            pstm.execute();

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            try{
                //
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
     * @param historico
     */
    public void update(Historico historico){

        String sql = "UPDATE historico SET nome = ?, numeroChave = ?, observacoes = ?, status = ?"+
                     "WHERE idHistorico = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //
            conn = ConnectionFactory.createConnectionToMySQL();

            //
            pstm = conn.prepareStatement(sql);

            //
            pstm.setString(1, historico.getNome());
            pstm.setInt(2, historico.getNumeroChave());
            pstm.setString(3, historico.getObservacoes());
            pstm.setString(4, historico.getStatus());

            //
            pstm.setInt(5, historico.getIdHistorico());

            //
            pstm.execute();

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            try{
                //
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
     * @param historico
     */
    public void updateDataFechamento(Historico historico){

        String sql = "UPDATE historico SET dataFechamento = ?"+
                     "WHERE idHistorico = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //
            conn = ConnectionFactory.createConnectionToMySQL();

            //
            pstm = conn.prepareStatement(sql);

            //
            pstm.setDate(1, new Date(historico.getDataFechamento().getTime()));

            //
            pstm.setInt(2, historico.getIdHistorico());

            //
            pstm.execute();

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            try{
                //
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
     * @return
     */
    public List<Historico> getHistorico(){

        String sql = "SELECT * FROM historico";

        List<Historico> listaHistorico = new ArrayList<Historico>();

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
            while(rset.next()){

                //
                Historico historico = new Historico();

                //
                historico.setIdHistorico(rset.getInt("idHistorico"));

                //
                historico.setNome(rset.getString("nome"));

                //
                historico.setNumeroChave(rset.getInt("numeroChave"));

                //
                historico.setObservacoes(rset.getString("observacoes"));

                //
                historico.setStatus(rset.getString("status"));

                //
                historico.setDataAbertura(rset.getDate("dataAbertura"));

                //
                historico.setDataFechamento(rset.getDate("dataFechamento"));

                //
                listaHistorico.add(historico);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{

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
        return listaHistorico;
    }

    /**
     *
     * @param idHistorico
     */
    public void deleteByID(int idHistorico){

        String sql = "DELETE FROM historico WHERE idHistorico = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //
            conn = ConnectionFactory.createConnectionToMySQL();

            //
            pstm = conn.prepareStatement(sql);

            //
            pstm.setInt(1, idHistorico);

            //
            pstm.execute();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                //
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



}