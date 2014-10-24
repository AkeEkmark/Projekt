package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class PlayerPanel extends JPanel{
	private ProgressPanel progressPanel;
	
	public PlayerPanel() {
		progressPanel = new ProgressPanel();
		setPreferredSize(new Dimension(200, 100));
		setBackground(Color.red );
		add(progressPanel);
		setVisible(true);
	}

}
