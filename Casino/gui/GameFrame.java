package gui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	MainPanel mainPanel;
	public GameFrame() {
		setPreferredSize(new Dimension(800, 600));
		
		mainPanel = new MainPanel();
		setContentPane(mainPanel);
		pack();
		setVisible(true);
		
	}
}
