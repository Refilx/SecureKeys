package br.com.securekeys.views.formScreen;

import javax.swing.*;
import javax.swing.text.*;

/**
 * Essa Classe obrigará que o campo de UserName na tela de cadastro de usuário seja preenchido com apenas letras minúsculas
 */
public class LowercaseDocumentFilter extends DocumentFilter {
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        String lowercaseString = string.toLowerCase();
        super.insertString(fb, offset, lowercaseString, attr);
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        String lowercaseText = text.toLowerCase();
        super.replace(fb, offset, length, lowercaseText, attrs);
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        super.remove(fb, offset, length);
    }
}
