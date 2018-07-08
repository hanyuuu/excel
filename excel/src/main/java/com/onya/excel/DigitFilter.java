package com.onya.excel;

import javax.swing.JTextField;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
public class DigitFilter {
	private static void TextFilter(JTextField TextField, final int length) {
		TextField.setDocument(new PlainDocument() {
			String chars = "0123456789.";
			public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
				if (chars.indexOf(str) != -1) {
					if (getLength() < length) {
						super.insertString(offs, str, a);
					}
				}
			}
		});
	}
	public static void PTextFilter(JTextField TextField, final int length) {
		TextFilter(TextField,length);
	}
	
}