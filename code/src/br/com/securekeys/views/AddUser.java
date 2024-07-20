package br.com.securekeys.views;

import br.com.securekeys.DAO.PessoaDAO;
import br.com.securekeys.DAO.UsuarioDAO;
import br.com.securekeys.model.Pessoa;
import br.com.securekeys.model.Usuario;

import javax.swing.*;
import java.util.Date;

public class AddUser extends AddUserScreen{

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

        //
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //
        PessoaDAO pessoaDAO = new PessoaDAO();

        //Verificamos se todos os campos foram devidamente preenchidos para continuar
        if(
                !nome.isBlank() &&
                        !cpf.isBlank() &&
                        !email.isBlank() &&
                        !telefone.isBlank() &&
                        !empresa.isBlank() &&
                        !cargo.isBlank() &&
                        !endereco.isBlank() &&
                        !cidade.isBlank() &&
                        !cep.isBlank() &&
                        !username.isBlank() &&
                        !role.equals("Nível de acesso...") &&
                        !pass.isBlank()
        ){
            //
            if(pessoaDAO.verifyCPF(cpf)){

                //
                if(usuarioDAO.verifyUsername(username)){

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

                }
                else{
                    //
                    JOptionPane.showMessageDialog(null, "Já existe um usuário com esse username cadastrado\n Digite um username diferente, por favor",
                            "Erro tentar realizar cadastro", JOptionPane.WARNING_MESSAGE);
                }
            }
            else{
                //
                JOptionPane.showMessageDialog(null, "Já existe um usuário com esse CPF cadastrado\n Use um CPF diferente, por favor",
                        "Erro tentar realizar cadastro", JOptionPane.WARNING_MESSAGE);
            }
        }
        else{
            //
            JOptionPane.showMessageDialog(null, "Por favor, preecha todos os campos!!!",
                    "Erro ao tentar realizar cadastro", JOptionPane.WARNING_MESSAGE);
        }

    };

}
