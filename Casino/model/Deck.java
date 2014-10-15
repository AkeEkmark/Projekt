package model;

import java.util.ArrayList;

public class Deck {
	private ArrayList<ArrayList<Card>> deck;
	private ArrayList<Card> hearts;
	private ArrayList<Card> spades;
	private ArrayList<Card> clubs;
	private ArrayList<Card> diamonds;
	/**
	 * Constructor for a deck of cards.
	 * Creates an arraylist containing 4 arraylists, one for each suit. 
	 * 0 = hearts.
	 * 1 = spades.
	 * 2 = clubs.
	 * 3 = diamonds.
	 */
	public Deck() {
		deck = new ArrayList<ArrayList<Card>>();
		hearts = new ArrayList<Card>();
		spades = new ArrayList<Card>();
		diamonds = new ArrayList<Card>();
		clubs = new ArrayList<Card>();
		deck.add(hearts);
		deck.add(spades);
		deck.add(clubs);
		deck.add(diamonds);
		for (int i = 1; i < 14; i++) {
			Card card = new Card("Heart", i);
			hearts.add(card);
		}
		for (int i = 1; i < 14; i++) {
			Card card = new Card("Spade", i);
			spades.add(card);
		}
		for (int i = 1; i < 14; i++) {
			Card card = new Card("Club", i);
			clubs.add(card);
		}
		for (int i = 1; i < 14; i++) {
			Card card = new Card("Diamond", i);
			diamonds.add(card);
		}	
	}
	/**
	 * A get method to get a card from the deck.
	 * @param i is the suit of card, 0 = hearts, 1 = spades, 2 = clubs, 3 = diamonds
	 * @param j is the value of the card, 1 = ace, 13 = king
	 * @return The card at that position.
	 */
	public Card getCard(int i, int j) {
		Card card = deck.get(i).get(j);
		return card;
	}
	
}
