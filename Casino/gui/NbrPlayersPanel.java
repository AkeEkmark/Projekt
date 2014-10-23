package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class NbrPlayersPanel extends JPanel implements ActionListener{
	public NbrPlayersPanel(){
		 JRadioButton c1 = new JRadioButton("2 players");
		 JRadioButton c2 = new JRadioButton("3 players");
		 JRadioButton c3 = new JRadioButton("4 players");
		 JLabel l2 = new JLabel("Number of players");
		 ButtonGroup btngroup=new ButtonGroup(); 
		 
		 btngroup.add(c1);
		 btngroup.add(c2);
		 btngroup.add(c3);
		 add(l2);
		 add(c1);
		 add(c2);
		 add(c3);
		 setPreferredSize(new Dimension(100, 200));
		 setBackground(Color.CYAN);
		 setVisible(true);
		
	}

	
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
