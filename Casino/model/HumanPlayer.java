package model;

import java.util.ArrayList;
/**
 * A class describing a Human Player
 * The class is used to construct a human player
 * HumanPlayer is a subclass to Player
 * @author �ke Ekmark, Andreas Wieselqvist och Simon S�derh�ll.

 */
public class HumanPlayer extends Player {
	/**
	 * 
	 * @param name the name of the player
	 * @param position the position on the board
	 */
	public HumanPlayer(String name, int position) {
		super.name = name;
		super.position = position;
		super.cardsInPile = new ArrayList<Card>();
		super.cardsOnHand = new ArrayList<Card>();
		
		
	}
}
