package br.com.securekeys.views.formScreen.tableClasses;

import br.com.securekeys.DAO.ChaveDAO;
import br.com.securekeys.DAO.HistoricoDAO;
import br.com.securekeys.model.Historico;

import javax.swing.table.TableCellRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageCellRenderer extends TableConfigurator {

    static HistoricoDAO historicoDAO = new HistoricoDAO();


    public ImageCellRenderer(){

    }

    /**
     *  CLASSES DE BOTÕES DA COLUNA DE AÇÕES INICIO
     */

    /**
     * @version 1.0 11/09/98
     */
    static class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof ImageIcon) {
                setIcon((ImageIcon) value);
                setText(null);
            } else {
                setIcon(null);
                setText(value != null ? value.toString() : "");
            }
            if (isSelected) {
                setBackground(table.getSelectionBackground());
                setForeground(table.getSelectionForeground());
            } else {
                setBackground(table.getBackground());
                setForeground(table.getForeground());
            }
            return this;

        }
    }

    /**
     * @version 1.0 11/09/98
     */
    static class ButtonEditor extends DefaultCellEditor {
        protected JButton buttonTeste;

        private Object valor;

        private String labelTeste;

        private int numeroColuna;

        private Historico dadosDaTable = new Historico();

        private boolean isPushed;

        JTable table = new JTable();
        JScrollPane jScrollPane = new JScrollPane();

        public ButtonEditor(JCheckBox checkBox, JTable jTable, JScrollPane jScrollPane) {
            super(checkBox);
            buttonTeste = new JButton();
            buttonTeste.setOpaque(true);
            buttonTeste.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });

            this.table = jTable;
            this.jScrollPane = jScrollPane;
        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                                                     boolean isSelected, int row, int column) {
            if (isSelected) {
                buttonTeste.setForeground(table.getSelectionForeground());
                buttonTeste.setBackground(table.getSelectionBackground());
            } else {
                buttonTeste.setForeground(table.getForeground());
                buttonTeste.setBackground(table.getBackground());
            }

            Historico[] listaAtualizada = historicoDAO.getHistorico().toArray(new Historico[0]);

            //
            dadosDaTable.setIdHistorico(listaAtualizada[row].getIdHistorico());
            dadosDaTable.setIdChave(listaAtualizada[row].getIdChave());
            dadosDaTable.setDataFechamento(listaAtualizada[row].getDataFechamento());

            //
            numeroColuna = column;

            if (value instanceof ImageIcon) {
                buttonTeste.setIcon((ImageIcon) value);
                buttonTeste.setText(null);
            } else {
                buttonTeste.setIcon(null);
                buttonTeste.setText(value != null ? value.toString() : "");
            }
            isPushed = true;
            return buttonTeste;
        }


        public Object getCellEditorValue() {
            if (isPushed) {

                // Colocar confirmação nas ações dos botões de devolução e exclusão

                //Testa se o botão apertado foi da coluna de ações
                if(numeroColuna == 7) {

                    int opcao = JOptionPane.showOptionDialog(null, "Deseja mesmo devolver essa chave?", "Confirmação",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Sim","Não"}, null);

                    //Testa se o campo dataFechamento está vazio
                    if (dadosDaTable.getDataFechamento() == null && opcao == 0) {
                        ChaveDAO chaveDAO = new ChaveDAO();

                        chaveDAO.devolverChave(dadosDaTable);

                        Historico[] listaAtualizada = historicoDAO.getHistorico().toArray(new Historico[0]);

                        refreshHistorico(table, listaAtualizada, jScrollPane);

                    } else if(dadosDaTable.getDataFechamento() != null && opcao == 0) {
                        JOptionPane.showMessageDialog(null, "A chave já foi devolvida");
                    }
                    else{
                        return buttonTeste.getIcon();
                    }
                }

                // Se o usuário apertar o botão de DELETE
                if(numeroColuna == 8){

                    // Confirma se o usuário deseja mesmo fazer a exclusão
                    int opcao = JOptionPane.showOptionDialog(null, "Deseja mesmo excluir essa chave?", "Confirmação",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Sim","Não"}, null);

                    if(opcao == 0) {
                        historicoDAO.deleteByID(dadosDaTable.getIdHistorico());

                        Historico[] listaPosDelete = historicoDAO.getHistorico().toArray(new Historico[0]);

                        table = tableConfigHistorico(table, listaPosDelete, jScrollPane);

                        refreshHistorico(table, listaPosDelete, jScrollPane);

                    }
                    else{
                        return buttonTeste.getIcon();
                    }

                }
            }
            isPushed = false;
            return buttonTeste.getIcon();
        }

        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }

    /**
     *  CLASSES DE BOTÕES DA COLUNA DE AÇÕES FIM
     */
}
