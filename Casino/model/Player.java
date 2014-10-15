package model;

import java.util.ArrayList;

public abstract class Player {
	protected int points = 0;
	protected int position;
	protected String name;
	protected ArrayList<Card> cardsOnHand;
	protected ArrayList<Card> cardsInPile;
	protected Board board;
	
	public void addPoints(int points) {
		this.points += points;
	}
	public ArrayList<Card> getCardsOnHand() {
		return cardsOnHand;
	}
	public ArrayList<Card> getCardsInPile() {
		return cardsInPile;
	}
	public void dealCardToHand(Card card) {
		cardsOnHand.add(card);
	}
	private void addCardToPile(Card card) {
		cardsInPile.add(card);
	}
	public void takeCardFromBoard(Card cardOnHand, ArrayList<Card> cardsOnBoard) {
		addCardToPile(cardOnHand);
		for (Card card : cardsOnBoard) {
			addCardToPile(card);
		}
	}
	public void addCardToBoard(Card card) {
		board.addCardtoBoard(card);
	}
	public int getPoints() {
		return points;
	}
	public int getPosition() {
		return position;
	}
	public String getName() {
		return name;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
}
