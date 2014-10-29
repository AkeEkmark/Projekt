package gui.Board;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.Green;
import gui.Cosmetics.PanelBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import model.Card;

public class BoardPanel extends ColorPanel {
	private ScoreboardPanel sbp;
	private JPanel emptyslot;

	public BoardPanel() { // mittenruta gr�n
		super("Green");
		// sbp = new ScoreboardPanel();
		setPreferredSize(new Dimension(600, 400));
		emptyslot = new ColorPanel("Green");
		emptyslot.setPreferredSize(new Dimension(84, 130));
		emptyslot.setBorder(new PanelBorder("Throw Card"));
		add(emptyslot);
		// add(sbp);
		setVisible(true);
	}

	public void addCard(Card card) {
		add(new FrontCardPanel(card));
	}

}
