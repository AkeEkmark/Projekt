package control;

import java.util.ArrayList;

import model.Card;

public interface PlayerMoves {
	public void takeCardFromBoard(Card cardOnHand, ArrayList<Card> cardsOnBoard );
	public void addCardToBoard(Card cardOnHand);
}
