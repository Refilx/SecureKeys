package br.com.securekeys.views;

import br.com.securekeys.factory.ConnectionFactory;
import br.com.securekeys.model.Historico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HistoricoChave extends HistoricoChaveScreen {

    public HistoricoChave(){

    }

    public List<Historico> filter(Object dataFiltro){

        String sql = "SELECT * FROM consultahistorico WHERE dataAbertura LIKE ? AND dataAbertura IS NOT NULL;";

        dataFiltro = ""+dataFiltro+"-%";

        List<Historico> filtroList = new ArrayList<Historico>();

        Connection conn = null;

        PreparedStatement pstm = null;

        ResultSet rset = null;

        try{
            //
            conn = ConnectionFactory.createConnectionToMySQL();

            //
            pstm = conn.prepareStatement(sql);

            // Passando a data que será filtrada para a preparedStatement
            pstm.setObject(1, dataFiltro);

            //
            rset = pstm.executeQuery();

            //
            while(rset.next()){

                //
                Historico historico = new Historico();

                //
                historico.setIdHistorico(rset.getInt("idHistorico"));

                //
                historico.setIdChave(rset.getInt("idChave"));

                //
                historico.setNumeroChave(rset.getInt("numerochave"));

                //
                historico.setNome(rset.getString("nome"));

                //
                historico.setCargo(rset.getString("cargo"));

                //
                historico.setObservacoes(rset.getString("observacoes"));

                //
                historico.setStatus(rset.getString("status"));

                //
                historico.setDataAbertura(rset.getDate("dataAbertura"));

                //
                historico.setDataFechamento(rset.getDate("dataFechamento"));

                //
                filtroList.add(historico);
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

        return filtroList;
    }

}
