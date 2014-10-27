package gui;

import guicosmetics.Boardcolor;
import guicosmetics.ScoreboardPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import model.Card;

public class BoardPanel extends JPanel {
	private ScoreboardPanel sbp;

	public BoardPanel() {

		sbp = new ScoreboardPanel();
		setPreferredSize(new Dimension(600, 400));
		setBackground(new Boardcolor());
		add(sbp);
		setVisible(true);
	}

	public void addCard(Card card) {

	}

}
