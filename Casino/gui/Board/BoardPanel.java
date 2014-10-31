package gui.Board;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.Green;
import gui.Cosmetics.PanelBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Card;

public class BoardPanel extends ColorPanel {
	private ScoreboardPanel sbp;
	private JPanel emptyslot;
	private ArrayList<FrontCardPanel> frontPanels;

	public BoardPanel() { // mittenruta gr�n
		super("Green");
		// sbp = new ScoreboardPanel();
		frontPanels = new ArrayList<FrontCardPanel>();
		setPreferredSize(new Dimension(600, 400));
		emptyslot = new ColorPanel("Green");
		emptyslot.setPreferredSize(new Dimension(84, 130));
		emptyslot.setBorder(new PanelBorder("Throw Card"));
		add(emptyslot);
		// add(sbp);
		setVisible(true);
	}

	public void addCard(Card card) {
		FrontCardPanel front = new FrontCardPanel(card);
		add(front);
		frontPanels.add(front);
	}

	public void removeCard(Card card) {
		for (FrontCardPanel front : frontPanels) {
			if (front.getCard() == card);
				remove(front);
		}
		
	}

}
