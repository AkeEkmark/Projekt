package gui.Board;

import gui.Cosmetics.Green;
import gui.Cosmetics.PanelBorder;

import java.awt.Color;
import java.awt.Dimension;

import gui.Cosmetics.ColorPanel;

import javax.swing.JPanel;

import model.Card;
import model.Player;

public class OpponentPanel extends ColorPanel implements Players {
	private String position;
	private Player player;
	public OpponentPanel(String position, Player player) {
		super("Green");
		this.player = player;
		setBorder(new PanelBorder(""));
		this.position = position;
		if (position == "NORTH"){
			setPreferredSize(new Dimension(100, 150));
		
	}else {
			setPreferredSize(new Dimension(150, 336));
		
		}
		
		setVisible(true);
	}
	public void addCard(Card card){
		add(new BackCardPanel(position));
	}
	public Player getPlayer() {
		return player;
	}
}
