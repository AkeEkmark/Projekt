package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DifficultyPanel extends JPanel implements ActionListener {
	public DifficultyPanel(){
		 JRadioButton c1 = new JRadioButton("Easy");
		 JRadioButton c2 = new JRadioButton("Hard");
		 JRadioButton c3 = new JRadioButton("King");
		 JLabel l1 = new JLabel("Choose Level");
		 
		 ButtonGroup btngroup=new ButtonGroup(); 
		 btngroup.add(c1);
		 btngroup.add(c2);
		 btngroup.add(c3);
		 add(l1);
		 
		 add(c1);
		 add(c2);
		 add(c3);
		 
		 setPreferredSize(new Dimension(100, 200));
		 setBackground(Color.YELLOW);
		 setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
	
		
	}

}
