package br.com.securekeys.views;

import br.com.securekeys.model.Historico;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableConfigurator {

    public TableConfigurator(){}

    /**
     * Método para atualizar os dados da tabela
     * @param jTable
     * @param array
     * @return
     */
    public static JTable refresh(JTable jTable, Historico[] array, JScrollPane jScrollPane){
        for(int i = 0; i < array.length; i++){
            jTable.setValueAt(array[i].getNumeroChave(), i, 0);
            jTable.setValueAt(array[i].getNome(), i, 1);
            jTable.setValueAt(array[i].getCargo(), i, 2);
            jTable.setValueAt(array[i].getObservacoes(), i, 3);
            jTable.setValueAt(array[i].getStatus(), i, 4);
            jTable.setValueAt(array[i].getDataAbertura(), i, 5);
            jTable.setValueAt(array[i].getDataFechamento(), i, 6);
            jTable.setValueAt("Devolver Chave", i, 7);
            jTable.setValueAt("Excluir", i, 8);
        }

        jTable.getColumnModel().getColumn(7).setCellRenderer(new TableButtons.ButtonRenderer());
        jTable.getColumnModel().getColumn(7).setCellEditor(new TableButtons.ButtonEditor(new JCheckBox(), jTable, jScrollPane));

        // Botões de exluir o registro
        jTable.getColumnModel().getColumn(8).setCellRenderer(new TableButtons.ButtonRenderer());
        jTable.getColumnModel().getColumn(8).setCellEditor(new TableButtons.ButtonEditor(new JCheckBox(), jTable, jScrollPane));

        return jTable;
    }


    /**
     * Método para configurar a tabela
     * @param table
     * @param array
     */
    public static JTable tableConfig(JTable table, Historico[] array, JScrollPane jScrollPane){
        table = new JTable();

        table.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        table.setModel(new DefaultTableModel(
                new Object[array.length][9],
                new String[]{
                        "Nº da chave", "Nome da pessoa", "Cargo", "Observação", "Status", "Data de abertura", "Data de fechamento", "",""
                }
        ));
        table.setColumnSelectionAllowed(true);
        jScrollPane.setViewportView(table);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setRowHeight(50);
        table.getColumnModel().getColumn(0).setPreferredWidth(80);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(170);
        table.getColumnModel().getColumn(3).setPreferredWidth(575);
        table.getColumnModel().getColumn(4).setPreferredWidth(150);
        table.getColumnModel().getColumn(5).setPreferredWidth(125);
        table.getColumnModel().getColumn(6).setPreferredWidth(125);
        table.getColumnModel().getColumn(7).setPreferredWidth(125);
        table.getColumnModel().getColumn(8).setPreferredWidth(100);

        return table;
    }
}
