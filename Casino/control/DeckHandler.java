package control;

import model.Card;

public interface DeckHandler {
	public Card getCard(int i);
	public void createDeck();
	public void shuffleDeck();
}