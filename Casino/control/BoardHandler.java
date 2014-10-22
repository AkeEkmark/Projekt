package control;

import java.util.ArrayList;

import model.Card;

public interface BoardHandler {
	public ArrayList<Card> getCardsOnBoard();
	public void addCardtoBoard(Card card);
	public void removeCardFromBoard(Card card);
}