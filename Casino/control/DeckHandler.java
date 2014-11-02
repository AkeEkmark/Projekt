package control;

import model.Card;
import model.Deck;
/**
 * Interface to control the deck.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public interface DeckHandler {
	public Card getCard(int i);
	public void shuffleDeck();
	public Deck getDeck();
	public void returnCard(Card card);
}
