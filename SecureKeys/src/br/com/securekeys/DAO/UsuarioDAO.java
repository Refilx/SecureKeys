package br.com.securekeys.DAO;

import br.com.securekeys.factory.ConnectionFactory;
import br.com.securekeys.model.Usuario;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    /**
     * O método executa o INSERT no banco de dados
     */
    public void save(Usuario usuario){

        String sql = "INSERT INTO usuarios(username, password, role, dtRegistro) VALUES (?, ?, ?, ?)";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria uma conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma Query
            pstm = conn.prepareStatement(sql);

            //Adicionar valores que são esperados pela Query
            pstm.setString(1, usuario.getUsername());
            pstm.setString(2, usuario.getPassword());
            pstm.setString(3, usuario.getRole());
            pstm.setDate(4, new Date(usuario.getDtRegistro().getTime()));

            //Executa a Query
            pstm.execute();

        }catch(Exception e){
            e.printStackTrace();
        }finally {

            try{
                //Fecha as conexões que foram abertas com o banco de dados
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
     * O método executa o SELECT no banco de dados
     */
    public List<Usuario> getUsuario(){

        String sql = "SELECT * FROM usuario";

        List<Usuario> listaUsuario = new ArrayList<Usuario>();

        Connection conn = null;

        PreparedStatement pstm = null;

        //Classe que vai recuperar os dados do banco. ***SELECT***
        ResultSet rset = null;

        try{
            //Cria uma conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Cria uma PreparedStatement para executar uma Query
            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto houver um próximo dado para ser armazenado pelo ResultSet, os comandos serão executados
            while(rset.next()){
                Usuario usuario = new Usuario();

                //Recupera o idUser do usuário no banco de dados
                usuario.setIdUser(rset.getInt("idUser"));

                //Recupera o username do usuário no banco de dados
                usuario.setUsername(rset.getString("username"));

                //Recupera a password do usuário no banco de dados
                usuario.setPassword(rset.getString("password"));

                //Recupera a role do usuário no banco de dados
                usuario.setRole(rset.getString("role"));

                //Recupera a data de registro do usuário no banco de dados
                usuario.setDtRegistro(rset.getDate("dtRegistro"));

                //Adiciona o Usuário com todos os dados registrados à lista de Usuários
                listaUsuario.add(usuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {

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

        return listaUsuario;
    }

}
