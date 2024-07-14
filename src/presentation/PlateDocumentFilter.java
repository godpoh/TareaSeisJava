/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;


import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class PlateDocumentFilter extends DocumentFilter {
    private static final String VALID_CHARS = "BCDFGHJKLMNPQRSTVWXYZ0123456789";

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        string = string.toUpperCase();
        if (isValidPlateFormat(fb.getDocument().getText(0, fb.getDocument().getLength()) + string)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        text = text.toUpperCase();
        if (isValidPlateFormat(fb.getDocument().getText(0, fb.getDocument().getLength()) + text)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        super.remove(fb, offset, length);
    }

    private boolean isValidPlateFormat(String text) {
        if (text.length() > 6) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (VALID_CHARS.indexOf(c) == -1) {
                return false;
            }
            if (i < 3 && Character.isDigit(c)) {
                return false; // First three characters must be letters
            }
            if (i >= 3 && !Character.isDigit(c)) {
                return false; // Last three characters must be digits
            }
        }
        return true;
    }
}
