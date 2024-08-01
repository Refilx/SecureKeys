package br.com.securekeys.views.formScreen;

import br.com.securekeys.DAO.ChaveDAO;
import br.com.securekeys.model.Chave;

import javax.swing.*;

public class AddSala{

    private boolean result;

    public AddSala(
        String nome,
        int numeroChave,
        String bloco,
        String descricao,
        String opcao
    ){

        int quant = 0;

        // lógica para armazenar chave reserva
        if(opcao.equals("Sim")){
            quant = 2;
        }
        else if(opcao.equals("Não")){
            quant = 1;
        }

        //
        if(
                !nome.isBlank() &&
                !bloco.isBlank() &&
                !descricao.isBlank() &&
                !(quant==0)
        ){
            //
            Chave chave = new Chave();
            chave.setSala(nome);
            chave.setNumeroChave(numeroChave);
            chave.setBloco(bloco);
            chave.setObservacoes(descricao);
            chave.setQuantChave(quant);
            chave.setStatus("DISPONÍVEL");

            ChaveDAO chaveDAO = new ChaveDAO();

            chaveDAO.save(chave);

            result = true;
        }
        else{
            //
            JOptionPane.showMessageDialog(null, "Por favor, preecha todos os campos!!!",
                    "Erro ao tentar realizar cadastro", JOptionPane.WARNING_MESSAGE);
            result = false;
        }
    }

    public boolean cadastroResult(){
        return result;
    }

}
