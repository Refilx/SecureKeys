package br.com.securekeys.views.formScreen.tableClasses;

import br.com.securekeys.model.Chave;
import br.com.securekeys.model.Historico;
import br.com.securekeys.model.Usuario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableConfigurator {

    public TableConfigurator(){}

    /**
     * Método para atualizar os dados da tabela Historico
     * @param jTable
     * @param array
     * @param jScrollPane
     * @return
     */
    public static JTable refreshHistorico(JTable jTable, Historico[] array, JScrollPane jScrollPane){

        Object[] images = {new ImageIcon(TableConfigurator.class.getClassLoader().getResource("br/com/securekeys/icons/key.png")),
                new ImageIcon(TableConfigurator.class.getClassLoader().getResource("br/com/securekeys/icons/delete.png"))};

        for(int i = 0; i < array.length; i++){
            jTable.setValueAt(array[i].getNumeroChave(), i, 0);
            jTable.setValueAt(array[i].getNome(), i, 1);
            jTable.setValueAt(array[i].getCargo(), i, 2);
            jTable.setValueAt(array[i].getObservacoes(), i, 3);
            jTable.setValueAt(array[i].getStatus(), i, 4);
            jTable.setValueAt(array[i].getDataAbertura(), i, 5);
            jTable.setValueAt(array[i].getDataFechamento(), i, 6);
//            jTable.setValueAt("Devolver", i, 7);
  //          jTable.setValueAt("Excluir", i, 8);

            jTable.setValueAt(images[0], i, 7);
            jTable.setValueAt(images[1], i, 8);

        }

        jTable.getColumnModel().getColumn(7).setCellRenderer(new ImageCellRenderer.ButtonRenderer());
        jTable.getColumnModel().getColumn(7).setCellEditor(new ImageCellRenderer.ButtonEditor(new JCheckBox(), jTable, jScrollPane));

        // Botões de exluir o registro
        jTable.getColumnModel().getColumn(8).setCellRenderer(new ImageCellRenderer.ButtonRenderer());
        jTable.getColumnModel().getColumn(8).setCellEditor(new ImageCellRenderer.ButtonEditor(new JCheckBox(), jTable, jScrollPane));

        return jTable;
    }


    /**
     * Método para configurar a tabela Historico
     * @param table
     * @param array
     * @param jScrollPane
     * @return
     */
    public static JTable tableConfigHistorico(JTable table, Historico[] array, JScrollPane jScrollPane){
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
        table.getColumnModel().getColumn(3).setPreferredWidth(500);
        table.getColumnModel().getColumn(4).setPreferredWidth(150);
        table.getColumnModel().getColumn(5).setPreferredWidth(125);
        table.getColumnModel().getColumn(6).setPreferredWidth(125);
        table.getColumnModel().getColumn(7).setPreferredWidth(60);
        table.getColumnModel().getColumn(8).setPreferredWidth(60);

        return table;
    }

    /**
     * Método para atualizar os dados da tabela Users
     * @param jTable
     * @param array
     * @param jScrollPane
     * @return
     */
    public static JTable refreshUsers(JTable jTable, Usuario[] array, JScrollPane jScrollPane){

//        Object[] images = {new ImageIcon(TableConfigurator.class.getClassLoader().getResource("br/com/securekeys/icons/key.png")),
//                new ImageIcon(TableConfigurator.class.getClassLoader().getResource("br/com/securekeys/icons/delete.png"))};

        for(int i = 0; i < array.length; i++){
            jTable.setValueAt(array[i].getUsername(), i, 0);
            jTable.setValueAt(array[i].getRole(), i, 1);
            jTable.setValueAt(array[i].getTelefone(), i, 2);
            jTable.setValueAt(array[i].getEmail(), i, 3);
//            jTable.setValueAt(array[i].getStatus(), i, 4);
//            jTable.setValueAt(array[i].getDataAbertura(), i, 5);
//            jTable.setValueAt(array[i].getDataFechamento(), i, 6);
////            jTable.setValueAt("Devolver", i, 7);
            //          jTable.setValueAt("Excluir", i, 8);

//            jTable.setValueAt(images[0], i, 7);
//            jTable.setValueAt(images[1], i, 8);

        }

//        jTable.getColumnModel().getColumn(7).setCellRenderer(new ImageCellRenderer.ButtonRenderer());
//        jTable.getColumnModel().getColumn(7).setCellEditor(new ImageCellRenderer.ButtonEditor(new JCheckBox(), jTable, jScrollPane));
//
//        // Botões de exluir o registro
//        jTable.getColumnModel().getColumn(8).setCellRenderer(new ImageCellRenderer.ButtonRenderer());
//        jTable.getColumnModel().getColumn(8).setCellEditor(new ImageCellRenderer.ButtonEditor(new JCheckBox(), jTable, jScrollPane));

        return jTable;
    }

    /**
     * Método para configurar a tabela Users
     * @param table
     * @param array
     * @param jScrollPane
     * @return
     */
    public static JTable tableConfigUsers(JTable table, Usuario[] array, JScrollPane jScrollPane){
        table = new JTable();

        table.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
        table.setModel(new DefaultTableModel(
                new Object[array.length][9],
                new String[]{
                        "Username", "Nível de acesso", "Telefone", "Email"
                }
        ));
        table.setColumnSelectionAllowed(true);
        jScrollPane.setViewportView(table);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setRowHeight(50);
        table.getColumnModel().getColumn(0).setPreferredWidth(200);
        table.getColumnModel().getColumn(1).setPreferredWidth(250);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(500);

        return table;
    }

    /**
     * Método para atualizar os dados da tabela Salas
     * @param jTable
     * @param array
     * @param jScrollPane
     * @return
     */
    public static JTable refreshSalas(JTable jTable, Chave[] array, JScrollPane jScrollPane){

//        Object[] images = {new ImageIcon(TableConfigurator.class.getClassLoader().getResource("br/com/securekeys/icons/key.png")),
//                new ImageIcon(TableConfigurator.class.getClassLoader().getResource("br/com/securekeys/icons/delete.png"))};

        for(int i = 0; i < array.length; i++){
            jTable.setValueAt(array[i].getSala(), i, 0);
            jTable.setValueAt(array[i].getNumeroChave(), i, 1);
            jTable.setValueAt(array[i].getBloco(), i, 2);
            jTable.setValueAt(array[i].getQuantChave(), i, 3);
            jTable.setValueAt(array[i].getStatus(), i, 4);
            jTable.setValueAt(array[i].getObservacoes(), i, 5);
//            jTable.setValueAt(array[i].getDataFechamento(), i, 6);
////            jTable.setValueAt("Devolver", i, 7);
            //          jTable.setValueAt("Excluir", i, 8);

//            jTable.setValueAt(images[0], i, 7);
//            jTable.setValueAt(images[1], i, 8);

        }

//        jTable.getColumnModel().getColumn(7).setCellRenderer(new ImageCellRenderer.ButtonRenderer());
//        jTable.getColumnModel().getColumn(7).setCellEditor(new ImageCellRenderer.ButtonEditor(new JCheckBox(), jTable, jScrollPane));
//
//        // Botões de exluir o registro
//        jTable.getColumnModel().getColumn(8).setCellRenderer(new ImageCellRenderer.ButtonRenderer());
//        jTable.getColumnModel().getColumn(8).setCellEditor(new ImageCellRenderer.ButtonEditor(new JCheckBox(), jTable, jScrollPane));

        return jTable;
    }


    /**
     * Método para configurar a tabela Salas
     * @param table
     * @param array
     * @param jScrollPane
     * @return
     */
    public static JTable tableConfigSalas(JTable table, Chave[] array, JScrollPane jScrollPane){
        table = new JTable();

        table.setFont(new Font("Segoe UI", 1, 20)); // NOI18N
        table.setModel(new DefaultTableModel(
                new Object[array.length][9],
                new String[]{
                        "Sala", "Número da chave", "Bloco / Prédio", "Chaves Disponíveis", "Status", "Descrição"
                }
        ));
        table.setColumnSelectionAllowed(true);
        jScrollPane.setViewportView(table);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.setRowHeight(50);
        table.getColumnModel().getColumn(0).setPreferredWidth(200);
        table.getColumnModel().getColumn(1).setPreferredWidth(220);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(250);
        table.getColumnModel().getColumn(4).setPreferredWidth(150);
        table.getColumnModel().getColumn(5).setPreferredWidth(500);

        return table;
    }

}
