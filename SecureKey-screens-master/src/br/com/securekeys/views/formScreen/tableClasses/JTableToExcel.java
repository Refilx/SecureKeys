package br.com.securekeys.views.formScreen.tableClasses;

import javax.swing.table.*;
import javax.swing.*;
import java.io.*;

public class JTableToExcel extends JFrame {

    //Ao chamar a classe passando a tabela no parâmetro, abre-se uma caixa de dialogo para o usuário escolher em que pasta quer salvar o arquivo
    public JTableToExcel(JTable table){

        JFileChooser fchoose = new JFileChooser();
        int option = fchoose.showSaveDialog(JTableToExcel.this);
        if(option == JFileChooser.APPROVE_OPTION){
            String name = fchoose.getSelectedFile().getName();
            String path = fchoose.getSelectedFile().getParentFile().getPath();
            String file = path + "\\" + name + ".xls";
            export(table, new File(file));
        }
        JTableToExcel.this.dispose();
    }

    //O método abaixo insere os dados da tabela no novo arquivo
    public void export(JTable table, File file){
        try
        {
            TableModel m = table.getModel();
            FileWriter fw = new FileWriter(file);

            int column;

            if(table.getColumnCount() == 9) {
                column = 7;
            }
            else{
                column = table.getColumnCount();
            }

            for(int c = 0; c < column; c++){
                fw.write(m.getColumnName(c) + "\t");
            }

            fw.write("\n");

            for(int r=0; r < table.getRowCount(); r++) {
                for(int c=0; c < column; c++) {
                    fw.write(m.getValueAt(r,c)+"\t");
                }
                fw.write("\n");
            }

            fw.close();
        }
        catch(IOException e){ e.printStackTrace(); }
    }

}