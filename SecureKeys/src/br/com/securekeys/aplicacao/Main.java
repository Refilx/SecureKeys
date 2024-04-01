package br.com.securekeys.aplicacao;

import br.com.securekeys.DAO.ChaveDAO;
import br.com.securekeys.DAO.LogsDAO;
import br.com.securekeys.DAO.PessoaDAO;
import br.com.securekeys.DAO.UsuarioDAO;
import br.com.securekeys.model.Chave;
import br.com.securekeys.model.Pessoa;
import br.com.securekeys.model.Usuario;
import br.com.securekeys.views.LoginScreen;
import org.jasypt.util.password.BasicPasswordEncryptor;
import org.jasypt.util.password.PasswordEncryptor;

import javax.security.auth.kerberos.EncryptionKey;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        /**
         * Teste da tabela chaves e das funcionalidades da classe ChaveDAO

//        ChaveDAO chaveDAO = new ChaveDAO();

//        Chave c1 = new Chave();

//        c1.setSala("LAB 124");
//        c1.setQuantChave(2);
//        c1.setStatus("Disponivel");

//        chaveDAO.save(c1);

//        Chave c2 = new Chave();

//        c2.setSala("LAB 118");
//        c2.setQuantChave(1);
//        c2.setStatus("Disponivel");

        //ID da chave que será atualizada
//        c2.setNumeroChave(1);

//        chaveDAO.update(c2);

//        chaveDAO.deleteByID(2);


//        for(Chave c : chaveDAO.getChave()){
//            System.out.println("Numero da chave: "+c.getNumeroChave()
//                                +"\nSala: "+c.getSala()
//                                +"\nQuantidade: "+c.getQuantChave()
//                                +"\nStatus: "+c.getStatus()+"\n");
//        }

        */

        /**
         * Teste da tabela pessoa e das funcionalidades da classe PessoaDAO
         */

//        PessoaDAO pessoaDAO = new PessoaDAO();
//
//        Pessoa p1 = new Pessoa();
//
//        p1.setNome("Adimael");
//        p1.setCpf("000.000.000-00");
//        p1.setEmail("a@teste.com.br");
//        p1.setTelefone("(00)0000-0000");
//        p1.setEndereco("bairro x, rua c, número n");
//        p1.setEmpresa("Empresa z");
//        p1.setCargo("DEV Front End");
//        p1.setCidade("Cidade");
//        p1.setCep("00000000");
//        p1.setDtRegistro(new Date());

//        pessoaDAO.save(p1);

//        pessoaDAO.deleteByID(3);

//        p1.setIdPessoa(1);

//        pessoaDAO.update(p1);




//        String s1 = "1234";
//
//        String s2 = "abcd";
//
//        BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
//
//        String senhaCriptografada = passwordEncryptor.encryptPassword(s1);
//
//        boolean resultado = passwordEncryptor.checkPassword(s1, senhaCriptografada);
//
//        System.out.println("Senha sem criptografar: "+s1);
//        System.out.println("Senha criptografada: "+senhaCriptografada);
//
//        senhaCriptografada = passwordEncryptor.encryptPassword(s1);
//
//        System.out.println("Senha criptografada: "+senhaCriptografada);
//        System.out.println("Resultado da comparação: "+resultado);


        Usuario usuario = new Usuario();

        usuario.setUsername("admin");
        usuario.setPassword("admin");
        usuario.setRole("ADMIN");
        usuario.setDtRegistro(new Date());

        UsuarioDAO usuarioDAO = new UsuarioDAO();

//        usuarioDAO.save(usuario);

//        usuarioDAO.deleteByID(3);
//
//        BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
//
//        String pass = "admin";

//        for(Usuario u : usuarioDAO.getUsuario()){
//            System.out.println("idUser: "+u.getIdUser()
//                                +"\nUsuario: "+u.getUsername()
//                                +"\nPass: "+u.getPassword()
//                                +"\nROLE: "+u.getRole()
//                                +"\nDATA REGISTRO: "+u.getDtRegistro()
//            +"\nA senha é igual(admin): "+passwordEncryptor.checkPassword(pass, u.getPassword())+"\n");
//        }

        LogsDAO logsDAO = new LogsDAO();

        String user = "admin";

        String pass = "admin";

        System.out.println("resultado: "+logsDAO.verifyPass(user, pass));
    }
}
