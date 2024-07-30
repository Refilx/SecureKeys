package br.com.securekeys.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.securekeys.factory.ConnectionFactory;
import br.com.securekeys.model.Pessoa;

public class PessoaDAO {

    /**
     * O método executa o INSERT no banco de dados
     */
    public void save(Pessoa pessoa){

        String sql = "INSERT INTO pessoa(nome, cpf, email, telefone, endereco, empresa, cargo, cidade, cep, dtRegistro) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        pessoa.setDtRegistro(new java.util.Date());

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria conexão com o banco
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Adicionar os valores que são esperados pela Query
            pstm.setString(1, pessoa.getNome());
            pstm.setString(2, pessoa.getCpf());
            pstm.setString(3, pessoa.getEmail());
            pstm.setString(4, pessoa.getTelefone());
            pstm.setString(5, pessoa.getEndereco());
            pstm.setString(6, pessoa.getEmpresa());
            pstm.setString(7, pessoa.getCargo());
            pstm.setString(8, pessoa.getCidade());
            pstm.setString(9, pessoa.getCep());
            pstm.setDate(10, new Date(pessoa.getDtRegistro().getTime()));

            //Executa a Query
            pstm.execute();

        }catch(Exception e){
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

            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * O método executa o SELECT no banco de dados
     */
    public List<Pessoa> getPessoa(){

        String sql = "SELECT * FROM pessoa";

        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();

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
                Pessoa pessoa = new Pessoa();

                //Recupera o id da Pessoa
                pessoa.setIdPessoa(rset.getInt("idPessoa"));

                //Recupera o nome da Pessoa
                pessoa.setNome(rset.getString("nome"));

                //Recupera o cpf da Pessoa
                pessoa.setCpf(rset.getString("cpf"));

                //Recupera o email da Pessoa
                pessoa.setEmail(rset.getString("email"));

                //Recupera o telefone da Pessoa
                pessoa.setTelefone(rset.getString("telefone"));

                //Recupera o endereço da Pessoa
                pessoa.setEndereco(rset.getString("endereco"));

                //Recupera o empresa da Pessoa
                pessoa.setEmpresa(rset.getString("empresa"));

                //Recupera o cargo da Pessoa
                pessoa.setCargo(rset.getString("cargo"));

                //Recupera o cidade da Pessoa
                pessoa.setCidade(rset.getString("cidade"));

                //Recupera o cep da Pessoa
                pessoa.setCep(rset.getString("cep"));

                //Recupera o data de registro da Pessoa
                pessoa.setDtRegistro(rset.getDate("dtRegistro"));

                //Adiciona a Pessoa com todos os dados registrados à lista de Pessoas
                listaPessoa.add(pessoa);
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

        return listaPessoa;
    }

    /**
     * O método executa o comando UPDATE no banco de dados
     */
    public void update(Pessoa pessoa){

        String sql = "UPDATE pessoa SET nome = ?, cpf = ?, email = ?, telefone = ?, endereco = ?, empresa = ?, cargo = ?, cidade = ?, cep = ?, DtRegistro = ?"+
                "WHERE idPessoa = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Adicina os valores para atualizar
            pstm.setString(1, pessoa.getNome());
            pstm.setString(2, pessoa.getCpf());
            pstm.setString(3, pessoa.getEmail());
            pstm.setString(4, pessoa.getTelefone());
            pstm.setString(5, pessoa.getEndereco());
            pstm.setString(6, pessoa.getEmpresa());
            pstm.setString(7, pessoa.getCargo());
            pstm.setString(8, pessoa.getCidade());
            pstm.setString(9, pessoa.getCep());
            pstm.setDate(10, new Date(pessoa.getDtRegistro().getTime()));

            //Qual o ID do registro que deseja atualizar? passando o id de pessoa para atualizar o registro
            pstm.setInt(11, pessoa.getIdPessoa());

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
    public void deleteByID(int idPessoa){

        String sql = "DELETE FROM pessoa WHERE idPessoa = ?";

        Connection conn = null;

        PreparedStatement pstm = null;

        try{
            //Cria a conexão com o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //Criamos uma PreparedStatement para executar uma query
            pstm = conn.prepareStatement(sql);

            //Passando o id do registro que será excluído
            pstm.setInt(1, idPessoa);

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

}
