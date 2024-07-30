package br.com.securekeys.views.formScreen.tableClasses;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        if (value instanceof ImageIcon) {
            label.setIcon((ImageIcon) value);
        }
        label.setHorizontalAlignment(JLabel.CENTER);
        return label;
    }
}

