package gui.Board;

import gui.Cosmetics.Green;
import gui.Cosmetics.PanelBorder;
import gui.Cosmetics.ColorPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import model.Card;

public class PlayerPanel extends ColorPanel{
	private ProgressPanel progressPanel;
	
	public PlayerPanel() {
		super("Green");
		//setLayout(new BorderLayout());
		progressPanel = new ProgressPanel();
		setPreferredSize(new Dimension(200, 150));
		
		setBorder(new PanelBorder(""));
		add(progressPanel);
		setVisible(true);
	}
	public void addCard(Card card){
		add(new FrontCardPanel(card));
}
}
