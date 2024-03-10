package br.com.securekeys.aplicacao;

import br.com.securekeys.DAO.ChaveDAO;
import br.com.securekeys.model.Chave;

public class Main {

    public static void main(String[] args) {
        ChaveDAO chaveDAO = new ChaveDAO();

        Chave c1 = new Chave();

        c1.setSala("LAB 124");
        c1.setQuantChave(2);
        c1.setStatus("Disponivel");

//        chaveDAO.save(c1);

        Chave c2 = new Chave();

        c2.setSala("LAB 118");
        c2.setQuantChave(1);
        c2.setStatus("Disponivel");

        //ID da chave que será atualizada
        c2.setNumeroChave(3);

//        chaveDAO.update(c2);

        chaveDAO.deleteByID(4);


        for(Chave c : chaveDAO.getChave()){
            System.out.println("Numero da chave: "+c.getNumeroChave()
                                +"\nSala: "+c.getSala()
                                +"\nQuantidade: "+c.getQuantChave()
                                +"\nStatus: "+c.getStatus()+"\n \n");
        }


    }
}
