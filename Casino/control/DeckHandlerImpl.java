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
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void shuffleDeck() {
		// TODO Auto-generated method stub

	}
	public Deck getDeck() {
		return deck;
	}

}
