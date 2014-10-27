package gui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	private MainPanel mainPanel;
	public GameFrame() {
		setPreferredSize(new Dimension(800, 700));
		
		mainPanel = new MainPanel();
		setContentPane(mainPanel);
		pack();
		setVisible(true);
		
	}
}
