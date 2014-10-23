package control;

import model.Card;
import model.Deck;

public class DeckHandlerImpl implements DeckHandler {
	Deck deck;
	public DeckHandlerImpl() {
		deck = new Deck();
	}
	@Override
	public Card getCard(int i) {
		Card card = deck.getCard(i);
		return card;
	}

	@Override
	public void shuffleDeck() {
		deck.shuffleDeck();

	}
	@Override
	public Deck getDeck() {
		return deck;
	}

}
