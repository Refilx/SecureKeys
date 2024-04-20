package br.com.securekeys.views;

import javax.swing.table.*;
import javax.swing.*;
import java.io.*;

class JTableToExcel extends JFrame {

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

            for(int i = 0; i < 7; i++){
                fw.write(m.getColumnName(i) + "\t");
            }

            fw.write("\n");

            for(int i=0; i < 7; i++) {
                for(int j=0; j < 7; j++) {
                    fw.write(m.getValueAt(i,j)+"\t");
                }
                fw.write("\n");
            }

            fw.close();
        }
        catch(IOException e){ e.printStackTrace(); }
    }

}