package gui;

import guicosmetics.Boardcolor;
import guicosmetics.ProgressPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class PlayerPanel extends JPanel{
	private ProgressPanel progressPanel;
	
	public PlayerPanel() {
		setLayout(new BorderLayout());
		progressPanel = new ProgressPanel();
		setPreferredSize(new Dimension(200, 100));
		setBackground(new Boardcolor());
		add(progressPanel, BorderLayout.WEST);
		setVisible(true);
	}

}
