package com.crow.nanahoshi.ui;

import java.awt.*;

import javax.swing.*;

public class MainScreen {
	public static void buildScreen() {

		// Frame principal
		JFrame frame = new JFrame("Nanahoshi");
		frame.setSize(400, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setMinimumSize(new Dimension(400, 700));

		// Header
		JPanel header = new JPanel();
		header.setBackground(Color.darkGray);
		header.setPreferredSize(new Dimension(50, 30));
		frame.add(header);
		
		// Label Principal
		JPanel mainPanel = new JPanel(new GridBagLayout());

		// Propriedades do GridbagLayout
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(5, 10, 5, 10);

		// Seleciona mainPanel como painel de conteúdo padrão
		frame.setContentPane(mainPanel);
		// Torna a janela/frame principal visível
		frame.setVisible(true);
	}
}
