package gui;

import guicosmetics.Boardcolor;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class OpponentPanel extends JPanel {
	public OpponentPanel() {
		setPreferredSize(new Dimension(100, 200));
		setBackground(new Boardcolor());
		setVisible(true);
	}
}
