package gui;

import guicosmetics.Boardcolor;
import guicosmetics.FrontCardPanel;
import guicosmetics.PanelBorder;
import guicosmetics.ProgressPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import model.Card;

public class PlayerPanel extends JPanel{
	private ProgressPanel progressPanel;
	
	public PlayerPanel() {
		setLayout(new BorderLayout());
		progressPanel = new ProgressPanel();
		setPreferredSize(new Dimension(200, 150));
		setBackground(new Boardcolor());
		setBorder(new PanelBorder(""));
		add(progressPanel, BorderLayout.NORTH);
		setVisible(true);
	}
	public void addCard(Card card){
		add(new FrontCardPanel(card));
}
}
