package gui.Board;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.Green;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import model.Card;

public class BoardPanel extends ColorPanel {
	private ScoreboardPanel sbp;

	public BoardPanel() {		//mittenruta grön
		super("Green");
		sbp = new ScoreboardPanel();
		setPreferredSize(new Dimension(600, 400));
		
		add(sbp);
		setVisible(true);
	}

	public void addCard(Card card) {

	}

}
