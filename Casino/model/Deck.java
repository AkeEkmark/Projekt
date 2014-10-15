package model;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deck;
	
	/**
	 * Constructor for a deck of cards.
	 * Creates an arraylist containing 4 arraylists, one for each suit. 
	 * 0 = hearts.
	 * 1 = spades.
	 * 2 = clubs.
	 * 3 = diamonds.
	 */
	public Deck() {
		deck = new ArrayList<Card>();
		
		for (int i = 1; i < 14; i++) {
			Card card = new Card("Heart", i);
			deck.add(card);
		}
		for (int i = 1; i < 14; i++) {
			Card card = new Card("Spade", i);
			deck.add(card);
		}
		for (int i = 1; i < 14; i++) {
			Card card = new Card("Club", i);
			deck.add(card);
		}
		for (int i = 1; i < 14; i++) {
			Card card = new Card("Diamond", i);
			deck.add(card);
		}	
	}
	/**
	 * A get method to get a card from the deck.
	 * @param i is the suit of card, 0 = hearts, 1 = spades, 2 = clubs, 3 = diamonds
	 * @param j is the value of the card, 1 = ace, 13 = king
	 * @return The card at that position.
	 */
	public Card getCard(int i) {
		Card card = deck.get(i);
		return card;
	}
	public void shuffleDeck() {
		
	}
}
