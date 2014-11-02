package model;

import java.util.ArrayList;
/**
 * A class describing a cardgame board.
 * The class keeps track of the cards on the board with the help of an ArrayList
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class Board {
	private ArrayList<Card> cardsOnBoard;
	/**
	 * Simple constructor
	 */
	public Board() {
		cardsOnBoard = new ArrayList<Card>();
	}
	/**
	 * 
	 * @return ArrayList containing the cards on the board
	 */
	public ArrayList<Card> getCardsOnBoard() {
		return cardsOnBoard;
	}
	/**
	 * 
	 * @param card : the card to add to the board
	 */
	public void addCardToBoard(Card card) {
		cardsOnBoard.add(card);
	}
	/**
	 * 
	 * @param card : the card to remove from the board
	 */
	public void removeCardFromBoard(Card card) {
		cardsOnBoard.remove(card);
	}
}
