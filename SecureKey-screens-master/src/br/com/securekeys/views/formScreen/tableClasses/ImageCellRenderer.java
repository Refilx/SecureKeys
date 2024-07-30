package br.com.securekeys.views.formScreen.tableClasses;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class ImageCellRenderer extends JButton implements TableCellRenderer {

    public ImageCellRenderer() {
        setOpaque(true);
        setBorderPainted(false);
        setFocusPainted(false);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
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


//public class ImageCellRenderer extends DefaultTableCellRenderer {
//    @Override
//    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        if (value instanceof ImageIcon) {
//            setIcon((ImageIcon) value);
//            setText(null); // Para garantir que o texto não seja exibido
//        } else {
//            setIcon(null);
//            setText(value != null ? value.toString() : "");
//        }
//        return this;
//    }
//}