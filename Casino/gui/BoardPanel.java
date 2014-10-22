package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import model.Card;

public class BoardPanel extends JPanel{
	
	public BoardPanel() {
		setPreferredSize(new Dimension(600, 400));
		setBackground(Color.blue );
		setVisible(true);
	}
	public void addCard(Card card) {
		
	}
	
}
