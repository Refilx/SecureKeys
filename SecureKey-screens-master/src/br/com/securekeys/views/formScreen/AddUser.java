package br.com.securekeys.views.formScreen;

import br.com.securekeys.DAO.PessoaDAO;
import br.com.securekeys.DAO.UsuarioDAO;
import br.com.securekeys.DAO.VerifyDAO;
import br.com.securekeys.model.Pessoa;
import br.com.securekeys.model.Usuario;

import javax.swing.*;
import java.util.Date;

public class AddUser{

    private boolean result = false;

    public AddUser(
            String nome,
            String cpf,
            String email,
            String telefone,
            String empresa,
            String cargo,
            String endereco,
            String cidade,
            String cep,
            String username,
            String role,
            String pass

    ){

        //Verificamos se todos os campos foram devidamente preenchidos para continuar
        if(
                !nome.isBlank() &&
//                        !cpf.isBlank() &&
//                        !email.isBlank() &&
//                        !telefone.isBlank() &&
//                        !empresa.isBlank() &&
//                        !cargo.isBlank() &&
//                        !endereco.isBlank() &&
//                        !cidade.isBlank() &&
//                        !cep.isBlank() &&
                        !username.isBlank() &&
                        !role.equals("Selecione o nível de acesso...") &&
                        !pass.isBlank()
        ){

            //
            if(new VerifyDAO().verifyCPF(cpf)){

                //
                if(new VerifyDAO().verifyUsername(username)){

                    //
                    UsuarioDAO usuarioDAO = new UsuarioDAO();

                    //
                    PessoaDAO pessoaDAO = new PessoaDAO();

                    //
                    Usuario usuario = new Usuario();
                    usuario.setUsername(username);
                    usuario.setPassword(pass);
                    usuario.setRole(role);
                    usuario.setDtRegistro(new Date());

                    //
                    Pessoa pessoa = new Pessoa();
                    pessoa.setNome(nome);
                    pessoa.setCpf(cpf);
                    pessoa.setEmail(email);
                    pessoa.setTelefone(telefone);
                    pessoa.setEmpresa(empresa);
                    pessoa.setCargo(cargo);
                    pessoa.setEndereco(endereco);
                    pessoa.setCidade(cidade);
                    pessoa.setCep(cep);

                    //
                    usuarioDAO.save(usuario);
                    pessoaDAO.save(pessoa);

                    //
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                    result = true;

                }
                else{
                    //
                    JOptionPane.showMessageDialog(null, "Já existe um usuário com esse username cadastrado\n Digite um username diferente, por favor",
                            "Erro tentar realizar cadastro", JOptionPane.WARNING_MESSAGE);
                    result = false;
                }
            }
            else{
                //
                JOptionPane.showMessageDialog(null, "Já existe um usuário com esse CPF cadastrado\n Use um CPF diferente, por favor",
                        "Erro tentar realizar cadastro", JOptionPane.WARNING_MESSAGE);
                result = false;
            }
        }
        else{
            //
            JOptionPane.showMessageDialog(null, "Por favor, preecha todos os campos!!!",
                    "Erro ao tentar realizar cadastro", JOptionPane.WARNING_MESSAGE);
            result = false;
        }
    };

    public boolean cadastroResult(){
        return result;
    }
}
