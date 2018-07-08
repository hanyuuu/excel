package com.onya.excel;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Components {
	protected JFrame CreateMainFrame(String FrameName, JPanel PanelToBeAdded, int x, int y) {
		JFrame mainFrame = new JFrame(FrameName);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(x, y);
		mainFrame.setContentPane(PanelToBeAdded);
		mainFrame.setResizable(false);
		return mainFrame;
	}
	protected JLabel CreateLabel(String LabelContent, int x, int y, int w, int h) {
		JLabel Label = new JLabel(LabelContent);
		Label.setBounds(x, y, w, h);
		return Label;
	}
	protected JTextField CreateTextField(int x, int y, int w, int h) {
		JTextField textField = new JTextField();
		textField.setBounds(x, y, w, h);
		return textField;
	}
	protected JPanel CreateMainPanel() {
		JPanel MainPanel = new JPanel();
		MainPanel.setLayout(null);
		return MainPanel;
	}
	
	protected JPanel CreateSmallPanel(String name, int x, int y, int w, int h) {
		JPanel MainPanel = new JPanel();
		MainPanel.setLayout(null);
		MainPanel.setBorder(BorderFactory.createTitledBorder(name));
		MainPanel.setBounds(x, y, w, h);
		return MainPanel;
	}
	
	protected JButton CreateButton(String ButtonContent, int x, int y, int h, int w) {
		JButton a = new JButton(ButtonContent);
		a.setBounds(x, y, h, w);
		return a;
	}
}
