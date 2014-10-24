package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class PlayerPanel extends JPanel{
	private ProgressPanel progresspanel;
	
	public PlayerPanel() {
		progresspanel = new ProgressPanel();
		setPreferredSize(new Dimension(200, 100));
		setBackground(Color.red );
		setVisible(true);
	}

}
