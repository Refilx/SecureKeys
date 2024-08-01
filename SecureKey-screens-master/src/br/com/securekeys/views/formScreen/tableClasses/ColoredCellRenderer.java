package br.com.securekeys.views.formScreen.tableClasses;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class ColoredCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Se valor for INDISPONÍVEL ou EM ABERTO o texto recebe a coloração vermelha
        if (table.getValueAt(row, column).equals("INDISPONÍVEL") || table.getValueAt(row, column).equals("EM ABERTO")) {
            cell.setForeground(new Color(205, 51, 51));
        }// Se valor for DISPONÍVEL ou ENCERRADO o texto recebe a coloração verde
        else if(table.getValueAt(row, column).equals("DISPONÍVEL") || table.getValueAt(row, column).equals("ENCERRADO")){
            cell.setForeground(new Color(46,139,87));
        }

        return cell;
    }
}
