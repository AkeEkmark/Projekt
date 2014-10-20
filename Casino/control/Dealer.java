package control;

import model.Deck;

public class Dealer {
	Deck deck;
	public Dealer(Deck deck) {
		this.deck = deck;
	}
	public void shuffle() {
		deck.shuffleDeck();
	}
	public void dealCard(int position) {
		deck.getCard(0);
	}
}
