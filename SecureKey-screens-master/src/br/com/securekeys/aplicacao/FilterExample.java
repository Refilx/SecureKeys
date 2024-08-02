package br.com.securekeys.aplicacao;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    private static List<String> items;
    private static DefaultListModel<String> listModel;

    public static void main(String[] args) {
        // Dados iniciais
        items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("Item " + i);
        }

        // Configuração da interface
        JFrame frame = new JFrame("Filtro de Lista");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Campo de entrada
        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        // Modelo de lista e JList
        listModel = new DefaultListModel<>();
        items.forEach(listModel::addElement);
        JList<String> list = new JList<>(listModel);
        frame.add(new JScrollPane(list), BorderLayout.CENTER);

        // Adiciona DocumentListener ao campo de entrada
        textField.getDocument().addDocumentListener(new DocumentListener() {
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
                String query = textField.getText().toLowerCase();
                listModel.clear();
                items.stream()
                        .filter(item -> item.toLowerCase().contains(query))
                        .forEach(listModel::addElement);
            }
        });

        // Adiciona ListSelectionListener à JList
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedValue = list.getSelectedValue();
                    if (selectedValue != null) {
                        textField.setText(selectedValue);
                    }
                }
            }
        });

        // Exibe o JFrame
        frame.setVisible(true);
    }
}