package br.com.securekeys.views;

import br.com.securekeys.DAO.LogsDAO;
import br.com.securekeys.DAO.UsuarioDAO;

import javax.swing.*;

public class Login extends LoginScreen {

    public Login(){

    }

   public boolean resultVerify(String user, String pass) {

       boolean resultVerify = false;

       //Verificamos se os campos de usuário e senha estão devidamente preenchidos
       if(!user.isBlank() && !pass.isBlank()){
           LogsDAO logsDAO = new LogsDAO();

           //Verificação se o usuário ou a senha fornecida estão corretos
           resultVerify = logsDAO.verifyPass(user, pass);

           if(resultVerify){
               //Mensagem de login bem sucedido
               JOptionPane.showMessageDialog(null, "Login Realizado com Sucesso",
                       "", JOptionPane.INFORMATION_MESSAGE, null);
           }
           else{
               //Mensagem de erro no usuário/senha
               JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorretos \nPor favor tente novamente",
                       "Erro ao tentar realizar login", JOptionPane.ERROR_MESSAGE, null);
           }
       }
       else{
           JOptionPane.showMessageDialog(null, "Preencha todos os campos, por favor",
                   "Erro ao tentar realizar o login",JOptionPane.WARNING_MESSAGE, null);
       }

       return resultVerify;
   }
}
