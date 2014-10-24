package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StartPanel extends JPanel{
	private JButton startbtn;
	public StartPanel(){
		 startbtn = new JButton("Start");
		
		 setPreferredSize(new Dimension(25, 50));
		 setBackground(Color.MAGENTA);
		 setBorder(new PanelBorder(""));
		 add(startbtn);
		 setVisible(true);
		
		
	}

}
