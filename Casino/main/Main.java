package main;

import model.Card;
import model.Deck;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deck deck = new Deck();
		for (Card card : deck.getDeck()) {
			System.out.println(card);
		}
		deck.shuffleDeck();
		deck.shuffleDeck();
		deck.shuffleDeck();
		deck.shuffleDeck();
		for (Card card : deck.getDeck()) {
			System.out.println(card);
		}

	}

}
