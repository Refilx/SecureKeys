package br.com.securekeys.views.formScreen;

import br.com.securekeys.DAO.ChaveDAO;
import br.com.securekeys.DAO.PessoaDAO;
import br.com.securekeys.model.Chave;
import br.com.securekeys.model.Pessoa;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {

    private static List<Pessoa> pessoas;
    private static DefaultListModel<String> listModelPessoa;

    private static List<Chave> chaves;
    private static DefaultListModel<String> listModelChave;

    private static JTextField nomeUser;
    private static JTextField key;

    private static JPanel userPanel;
    private static JPanel keyPanel;

    public Emprestimo(JTextField userField, JTextField keyField, JPanel userPanel, JPanel keyPanel){
        nomeUser = userField;
        key = keyField;
        this.userPanel = userPanel;
        this.keyPanel = keyPanel;
    }

    public static void main(String[] args) {

        PessoaDAO pessoaDAO = new PessoaDAO();
        ChaveDAO chaveDAO = new ChaveDAO();

        //Puxandos os dados do banco de dados e colocando em listas auxiliares
        pessoas = pessoaDAO.getPessoa();
        chaves = chaveDAO.getChave();

        //Listas de itens que serão exibidos
        List<String> nomePessoas = new ArrayList<>();
        List<String> numeroChave = new ArrayList<>();

        //Colocando os valores do banco de dados nas listas que serão exibidas
        for (int i=0; i < pessoas.size(); i++){
            nomePessoas.add(i, pessoas.get(i).getNome());
        }
        for (int i=0; i < chaves.size(); i++){
            numeroChave.add(i, chaves.get(i).getSala());
        }

        // Modelo de lista e JList
        listModelPessoa = new DefaultListModel<>();
        nomePessoas.forEach(listModelPessoa::addElement);
        JList<String> jListNomePessoa = new JList<>(listModelPessoa);
        userPanel.add(new JScrollPane(jListNomePessoa));

        // Modelo de lista e JList
        listModelChave = new DefaultListModel<>();
        numeroChave.forEach(listModelChave::addElement);
        JList<String> jListNumeroChave = new JList<>(listModelChave);
        keyPanel.add(new JScrollPane(jListNumeroChave));

        // Adiciona DocumentListener ao campo de entrada do nome da pessoa
        nomeUser.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterList();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterList();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterList();
            }

            private void filterList() {
                String query = nomeUser.getText().toLowerCase();
                listModelPessoa.clear();
                nomePessoas.stream()
                        .filter(item -> item.toLowerCase().contains(query))
                        .forEach(listModelPessoa::addElement);
            }
        });

        // Adiciona DocumentListener ao campo de entrada da Chave
        key.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterList();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterList();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterList();
            }

            private void filterList() {
                String query = key.getText().toLowerCase();
                listModelChave.clear();
                numeroChave.stream()
                        .filter(item -> item.toLowerCase().contains(query))
                        .forEach(listModelChave::addElement);
            }
        });
    }
}
