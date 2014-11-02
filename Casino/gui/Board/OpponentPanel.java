package gui.Board;


import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.PanelBorder;

import java.awt.Dimension;
import java.util.ArrayList;

import model.Card;
import model.Player;
/**
 * A panel to display the opponents cards.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class OpponentPanel extends ColorPanel implements Players {
	private String position;
	private Player player;
	private ArrayList<BackCardPanel> cards;
	public OpponentPanel(String position, Player player) {
		super("Green");
		cards = new ArrayList<BackCardPanel>();
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
		BackCardPanel panel = new BackCardPanel(position);
		add(panel);
		cards.add(panel);
	}
	@Override
	public void removeCard(Card card) {
		cards.remove(0);
		remove(0);
		revalidate();
		repaint();
		
	}
	
	public Player getPlayer() {
		return player;
	}
	
}
