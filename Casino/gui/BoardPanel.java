package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import model.Card;

public class BoardPanel extends JPanel{
	private ScoreboardPanel sbp;
	public BoardPanel() {
		sbp = new ScoreboardPanel();
		setPreferredSize(new Dimension(600, 400));
		setBackground(Color.blue );
		add(sbp);
		setVisible(true);
	}
	public void addCard(Card card) {
		
	}
	
}
