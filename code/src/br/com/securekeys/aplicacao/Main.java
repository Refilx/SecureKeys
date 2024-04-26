package br.com.securekeys.aplicacao;

import br.com.securekeys.DAO.*;
import br.com.securekeys.model.*;
import br.com.securekeys.views.LoginScreen;
import org.jasypt.util.password.BasicPasswordEncryptor;
import org.jasypt.util.password.PasswordEncryptor;

import javax.security.auth.kerberos.EncryptionKey;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * Teste da tabela chaves e das funcionalidades da classe ChaveDAO


//        ChaveDAO chaveDAO = new ChaveDAO();
//
//        Chave c1 = new Chave();
//
//        c1.setSala("LAB 118");
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
         * Teste da tabela Pessoa e das funcionalidades da classe PessoaDAO


        PessoaDAO pessoaDAO = new PessoaDAO();

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

//        //Teste do SAVE
//        pessoaDAO.save(p1);
//
//        //Teste do DELETE
//        pessoaDAO.deleteByID(2);
//
          //Teste do UPDATE
//        p1.setIdPessoa(1);
//
//        pessoaDAO.update(p1);
//
//        //Teste do READ
//        for(Pessoa p : pessoaDAO.getPessoa()){
//            System.out.println("ID: "+p.getIdPessoa()+
//                    "\nNome: "+p.getNome()+
//                    "\nCPF: "+p.getCpf()+
//                    "\nEmail: "+p.getEmail()+
//                    "\nTelefone: "+p.getTelefone()+
//                    "\nEndereço: "+p.getEndereco()+
//                    "\nEmpresa: "+p.getEmpresa()+
//                    "\nCargo: "+p.getCargo()+
//                    "\nCidade: "+p.getCidade()+
//                    "\nCEP: "+p.getCep()+
//                    "\nData de Registro: "+p.getDtRegistro()+"\n");
//        }

        */

        /**
         * Teste da tabela Usuário e das funcionalidades da classe UsuárioDAO


        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuario = new Usuario();

        usuario.setUsername("Geovanna");
        usuario.setPassword("GeoPM");
        usuario.setRole("ADMINISTRADOR");
        usuario.setDtRegistro(new Date());

        //Teste do SAVE
        usuarioDAO.save(usuario);

        //Teste do DELETE
        usuarioDAO.deleteByID(3);

        //Teste do UPDATE
        usuario.setIdUser(4);
        usuarioDAO.update(usuario);

        //Teste do READ
        for(Usuario u : usuarioDAO.getUsuario()){
            System.out.println("idUser: "+u.getIdUser()
                                +"\nUsuario: "+u.getUsername()
                                +"\nPass: "+u.getPassword()
                                +"\nROLE: "+u.getRole()
                                +"\nDATA REGISTRO: "+u.getDtRegistro()+"\n");
        }

         */


        /**
         * Teste da tabela Logs e das funcionalidades da classe LogsDAO


        LogsDAO logsDAO = new LogsDAO();

        Logs logs = new Logs();

        logs.setIdUser(2);
        logs.setDtLog(new Date());

        //Teste da SAVE
//        logsDAO.save(logs);

        //Teste do DELETE
//        logsDAO.deleteByID(1);

        //Teste do UPDATE
//        logs.setIdLogs(3);
//        logsDAO.update(logs);

        //Teste do READ
//        for(Logs l : logsDAO.getLogs()){
//            System.out.println("idLogs: "+l.getIdLogs()+
//            "\nidUser: "+l.getIdUser()+
//                    "\nUsername: "+l.getUsername()+
//                    "\nData de Log: "+l.getDtLog()+"\n");
//        }

        */


        /**
         * Teste da tabela Histórico e das funcionalidades da classe HistoricoDAO


//        HistoricoDAO historicoDAO = new HistoricoDAO();
//
//        Historico historico = new Historico();
//
//        historico.setNome("Adimael");
//        historico.setNumeroChave(2);
//        historico.setObservacoes("O Estagiário pegou a chave do laboratório 118");
//        historico.setStatus("Em Aberto");
//        historico.setDataAbertura(new Date());

        //Teste do SAVE
//        historicoDAO.save(historico);

        //Teste do DELETE
//        historicoDAO.deleteByID(2);

        //Teste do UPDATE
//        historico.setIdHistorico(4);
//        historicoDAO.update(historico);

        //Teste do UPDATE DATA FECHAMENTO
//        historico.setDataFechamento(new Date());
//        historico.setIdHistorico(3);
//        historicoDAO.updateDataFechamento(historico);

        //Teste do READ
//        for(Historico h : historicoDAO.getHistorico()){
//            System.out.println("idHistórico: "+h.getIdHistorico()+
//                                "\nNome: "+h.getNome()+
//                                "\nNúmero da Chave: "+h.getNumeroChave()+
//                                "\nObservações: "+h.getObservacoes()+
//                                "\nStatus: "+h.getStatus()+
//                                "\nData de Abertura: "+h.getDataAbertura()+
//                                "\nData de Fechamento: "+h.getDataFechamento()+"\n");
//        }


         */

        ChaveDAO chaveDAO = new ChaveDAO();
//
        Historico historico = new Historico();

        historico.setIdPessoa(3);
        historico.setIdChave(2);
        historico.setObservacoes("O programador pegou a chave do laboratório 124");
        historico.setStatus("Em Aberto");
        historico.setDataAbertura(new Date());


//        chaveDAO.emprestarChave(historico);

        /**
         * Modificar método de devolver chaves, incluir verificação se tem chave para ser devolvida pelo usuário informado
         */
//        historico.setIdHistorico(9);
//        chaveDAO.devolverChave(historico);


        /**
         * Testando as Lists

//        List<Historico> historicoList = new ArrayList<>();
//
//        historicoList.add(historico);
//        historicoList.add(historico);
//        historicoList.add(historico);
//
//        System.out.println(historicoList.get(0).getObservacoes());
//
//        System.out.println(new Timestamp(System.currentTimeMillis()));

//        for(Historico h : historicoList){
//            System.out.println("idHistórico: "+h.getIdHistorico()+
//                                "\nNome: "+h.getNome()+
//                                "\nIdChave: "+h.getIdChave()+
//                                "\nObservações: "+h.getObservacoes()+
//                                "\nStatus: "+h.getStatus()+
//                                "\nData de Abertura: "+h.getDataAbertura()+
//                                "\nData de Fechamento: "+h.getDataFechamento()+"\n");
//        }

         */

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



//        LogsDAO logsDAO = new LogsDAO();
//
//        String user = "admin";
//
//        String pass = "admin";
//
//        System.out.println("resultado: "+logsDAO.verifyPass(user, pass));
    }
}
