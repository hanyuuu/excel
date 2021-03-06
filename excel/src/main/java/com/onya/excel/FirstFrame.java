package com.onya.excel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstFrame extends Components{
	private JLabel[] Labels= new JLabel[28];
	private JPanel[] SmallPanels= new JPanel[6];
	
	private JTextField[] TextFields= new JTextField[23];
	private String[] ComboBoxItems = {"ОС-1"};
	private JPanel mainPanel;
	private JFrame mainFrame;
	private JButton saveButton;
	private String[] LabelNames = {"Орг. получатель","Модель бухг.","Наим бухг.",
			"Код ОКОФ","аморт. группы","паспорта",
			"заводской","инвентарный","шифра инв.","Завод","Город","Страна","Фирма",
			"Город","Страна","Наименование","Номер","Дата","Длина","Ширина","Высота","Вес","Мощность","мм",
			"мм","мм","кг","??"};
	private int[] LabelBounds = {10,5,100,50,10,35,100,50,10,65,100,50,10,95,100,50,10,5,100,50,10,35,100,50,10,65,100,50,10,95,100,50,10,125,100,50,10,10,100,50,
			10,30,100,50,10,50,100,50,10,10,100,50,10,30,100,50,10,50,100,50,10,10,100,50,10,30,100,50,10,50,100,50,10,10,100,50,10,50,100,50,10,90,100,50,10,130,100,50,
			10,170,100,50,220,10,100,50,220,50,100,50,220,90,100,50,220,130,100,50,220,170,100,50};
	private String[] SmallPanelNames = {"Основное","Номер:","Изготовитель:","Сдатчик:","Документ о вводе в эксплуатацию:","Габариты"};
	private int[] SmallPanelBounds = {0,0,300,150, 0,150,300,180, 300,0,300,100, 300,120,300,100, 300,230,300,100, 600,0,300,220};
	private JComboBox comboBox;
	private int[] TextFieldBounds = {110,20,180,20, 110,50,180,20, 110,80,180,20, 110,110,180,20, 110,20,180,20, 110,50,180,20, 110,80,180,20, 110,110,180,20,
			110,140,180,20, 110,25,150,20, 110,45,150,20, 110,65,150,20, 110,25,150,20, 110,45,150,20, 110,65,150,20, 110,25,150,20, 110,45,150,20, 110,65,150,20,
			110,25,100,20, 110,65,100,20, 110,105,100,20, 110,145,100,20, 110,185,100,20};
	FirstFrame(){
		mainPanel = CreateMainPanel();
		mainFrame = CreateMainFrame("Ввод данных", mainPanel,900,370);
		comboBox = new JComboBox(ComboBoxItems);
		comboBox.setBounds(410,255,150,20);
		for (int i = 0;i<6;i++) {
			SmallPanels[i] = CreateSmallPanel(SmallPanelNames[i], SmallPanelBounds[i*4],SmallPanelBounds[i*4+1],SmallPanelBounds[i*4+2],SmallPanelBounds[i*4+3]);
		}
		
		for (int i = 0;i<28;i++) {
			Labels[i] = CreateLabel(LabelNames[i], LabelBounds[i*4], LabelBounds[i*4+1], LabelBounds[i*4+2], LabelBounds[i*4+3]);
		}
		
		for (int i = 0;i<23;i++) {
			TextFields[i] = CreateTextField(110,TextFieldBounds[i*4+1],TextFieldBounds[i*4+2],TextFieldBounds[i*4+3]);
		}
		
		for (int i = 0;i<4;i++) {
			SmallPanels[0].add(Labels[i]);
			SmallPanels[0].add(TextFields[i]);
		}
		
		for (int i = 4;i<9;i++) {
			SmallPanels[1].add(Labels[i]);
			SmallPanels[1].add(TextFields[i]);
		}
		
		for (int i = 9;i<12;i++) {
			SmallPanels[2].add(Labels[i]);
			SmallPanels[2].add(TextFields[i]);
		}
		
		for (int i = 12;i<15;i++) {
			SmallPanels[3].add(Labels[i]);
			SmallPanels[3].add(TextFields[i]);
		}
		
		for (int i = 15;i<18;i++) {
			SmallPanels[4].add(Labels[i]);
		}
		for (int i = 16;i<18;i++) {
			SmallPanels[4].add(TextFields[i]);
		}
		for (int i = 18;i<23;i++) {
			SmallPanels[5].add(TextFields[i]);
		}
		
		for (int i = 18;i<28;i++) {
			SmallPanels[5].add(Labels[i]);
		}
		mainPanel.add(comboBox);
		for (int i = 0;i<6;i++) {
			mainPanel.add(SmallPanels[i]);
		}
		DigitFilter j = new DigitFilter();
		for (int i = 17;i<23;i++) {
			j.PTextFilter(TextFields[i], 10);
		}
		mainFrame.setVisible(true);
		saveButton = CreateButton("Сгенерировать",615,235,150,30);
		mainPanel.add(saveButton);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Unit a = new Unit(TextFields[0].getText(),TextFields[1].getText(),TextFields[2].getText(),TextFields[3].getText(),
				TextFields[4].getText(),TextFields[5].getText(),TextFields[6].getText(),TextFields[7].getText(),TextFields[8].getText(),
				TextFields[9].getText(),TextFields[10].getText(),TextFields[11].getText(),
				TextFields[12].getText(),TextFields[13].getText(),TextFields[14].getText(),TextFields[16].getText(),TextFields[17].getText());
				try {
					if (comboBox.getSelectedItem().toString() == "ОС-1") {
						Module g = new Module(a,1);
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		});
	}
}
