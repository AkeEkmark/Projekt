package control;

import model.Card;

public interface DeckHandler {
	public Card getCard(int i, int j);
	public void createDeck();
	public void shuffleDeck();
}
