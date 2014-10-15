package model;

import java.util.ArrayList;

public class Board {
	private ArrayList<Card> cardsOnBoard;
	
	public Board() {
		cardsOnBoard = new ArrayList<Card>();
	}
	public ArrayList<Card> getCardsOnBoard() {
		return cardsOnBoard;
	}
	public void addCardtoBoard(Card card) {
		cardsOnBoard.add(card);
	}
	public void removeCardFromBoard(Card card) {
		cardsOnBoard.remove(card);
	}
}
