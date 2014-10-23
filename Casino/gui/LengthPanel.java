package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class LengthPanel extends JPanel implements ActionListener {
	public LengthPanel() {
		JRadioButton d1 = new JRadioButton("One deck");
		JRadioButton d2 = new JRadioButton("Two decks");
		JRadioButton d3 = new JRadioButton("Three decks");
		JRadioButton p1 = new JRadioButton("15 points");
		JRadioButton p2 = new JRadioButton("20 points");
		JRadioButton p3 = new JRadioButton("30 points");
		JLabel i = new JLabel("Victory Condition");
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

		
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));

		ButtonGroup btngroup = new ButtonGroup();
		btngroup.add(d1);
		btngroup.add(d2);
		btngroup.add(d3);

		btngroup.add(p1);
		btngroup.add(p2);
		btngroup.add(p3);
		
		
		
		add(i);
		add(panel1);
		add(panel2);
	
		
		
		panel1.add(d1);
		panel1.add(d2);
		panel1.add(d3);

		panel2.add(p1);
		panel2.add(p2);
		panel2.add(p3);

		setPreferredSize(new Dimension(100, 250));
		
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

	}
}
