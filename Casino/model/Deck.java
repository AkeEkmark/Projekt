package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import model.Card.Suit;
import model.Card.Value;

public class Deck {
	private ArrayList<Card> deck;

	
	/**
	 * Constructor for a deck of cards.
	 * Creates an arraylist containing the playingcards. 
	 * Ace - King
	 * 0 - 12 = hearts.
	 * 13 - 25 = spades.
	 * 26 - 38 = clubs.
	 * 39 - 51 = diamonds.
	 */
	public Deck() {
		deck = new ArrayList<Card>();
		int i = 0;
		for (Suit suit : Suit.values()) {
			for (Value value : Value.values()) {
				String filename = "Cards/"+i+".png";
				Card card = new Card(suit, value, filename);
				deck.add(card);
				i++;
			}
		}
			
	}
	/**
	 * A get method to get a card from the deck.
	 * @param i is the position of the card
	 * @return The card at that position.
	 */
	public Card getCard(int i) {
		Card card = deck.get(i);
		deck.remove(i);
		return card;
	}
	/**
	 * Shuffles the deck using a Random.
	 */
	public void shuffleDeck() {
		long seed = System.nanoTime();
		Collections.shuffle(deck, new Random(seed));
	}
	/**
	 * 
	 * @return the deck
	 */
	public ArrayList<Card> getDeck() {
		return deck;
	}
	/**
	 * takes a card and puts it back in the deck.
	 * Also sets i to notSelected.
	 * @param card the card to put back in the deck
	 */
	public void returnCard(Card card) {
		card.setNotSelected();
		deck.add(card);
	}
}
