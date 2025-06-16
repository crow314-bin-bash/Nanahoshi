package com.crow.nanahoshi.util;

import javax.swing.*;

public class ErrorHandler {
	public static void handle(Exception e, String context) {
		JOptionPane.showMessageDialog(null, "Erro em " + context + ": " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		e.printStackTrace();
	}
}