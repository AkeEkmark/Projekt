package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class StartPanel extends JPanel{
	JButton startbtn = new JButton("Start");
	public StartPanel(){
		 setPreferredSize(new Dimension(100, 100));
		 setBackground(Color.MAGENTA);
		 add(startbtn);
		 setVisible(true);
		
		
	}

}
