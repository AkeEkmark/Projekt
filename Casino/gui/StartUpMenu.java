package gui;

import javax.swing.*;

public class StartUpMenu extends JFrame {


	public StartUpMenu() {


		setSize(1000, 1000);
		 JToggleButton d1 = new JToggleButton("Difficulty 1");
		 JToggleButton d2 = new JToggleButton("Difficulty 2");
		 JToggleButton d3 = new JToggleButton("Difficulty 3");
		 d1.setSize(150, 50);
		 d2.setSize(150, 50);
		 d3.setSize(150, 50);
		 d1.setLocation(0, 0);
		 d2.setLocation(150, 0);
		 d3.setLocation(300, 0);
		 add(d1);
		 add(d2);
		 add(d3);
		 setVisible(true);
		
	}

}
