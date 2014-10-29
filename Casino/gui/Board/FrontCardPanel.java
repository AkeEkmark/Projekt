package gui.Board;

import java.awt.image.BufferedImage;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Card;

public class FrontCardPanel extends JPanel {
	private Card card;
	private BufferedImage icon;
	private JLabel l;
	public FrontCardPanel(Card card) {
		this.card = card;
	}
	
}
