package control;

import model.Card;
import model.Deck;
/**
 * Interface to control the deck.
 * @author �ke Ekmark, Andreas Wieselqvist och Simon S�derh�ll.
 *
 */
public interface DeckHandler {
	public Card getCard(int i);
	public void shuffleDeck();
	public Deck getDeck();
	public void returnCard(Card card);
}
