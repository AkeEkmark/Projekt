package control;

import model.Card;
import model.Deck;

public interface DeckHandler {
	public Card getCard(int i);
	public void shuffleDeck();
	public Deck getDeck();
}
