package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class StartUpMenu extends JFrame {


	public StartUpMenu() {
		
        setName("Initial Setup");
        setSize(550, 450);
		JToggleButton d1 = new JToggleButton("Difficulty 1");
		JToggleButton d2 = new JToggleButton("Difficulty 2");
		 JToggleButton d3 = new JToggleButton("Difficulty 3");
		 JButton players1 = new JButton("1 opponent");
		 JButton players2 = new JButton("2 opponents");
		 JButton players3 = new JButton("3 opponents");
		 JLabel l1 = new JLabel("Choose number of opponents");
		 JLabel l2 = new JLabel("Choose difficulty");
		
		 
		 d1.setSize(150, 50);
		 d2.setSize(150, 50);
		 d3.setSize(150, 50);
		 players1.setSize(150,50);
		 players2.setSize(150,50);
		 players3.setSize(150,50);
		 d1.setLocation(0, 50);
		 d2.setLocation(150, 50);
		 d3.setLocation(300, 50);
		 players1.setLocation(0,150);
		 players2.setLocation(150,150);
		 players3.setLocation(300,150);
		 l1.setLocation(150, 100);
		 l2.setLocation(0,0);
		 add(l2);
		 add(d1);
		 add(d2);
		 add(d3);
		 add(players1);
		 add(players2);
		 add(players3);
		
		 add (l1);
		 setVisible(true);
		 
		
	}

}
