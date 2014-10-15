package model;

import java.util.ArrayList;

public class HumanPlayer extends Player {
	
	public HumanPlayer(String name, int position) {
		super.name = name;
		super.position = position;
		super.cardsInPile = new ArrayList<Card>();
		super.cardsOnHand = new ArrayList<Card>();
		
		
	}
}
