package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StartPanel extends JPanel{
	JButton startbtn = new JButton("Start");
	public StartPanel(){
		
		
		 setPreferredSize(new Dimension(25, 50));
		 setBackground(Color.MAGENTA);
		 
		 add(startbtn);
		 setVisible(true);
		
		
	}

}
