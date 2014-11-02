package model;

import java.util.ArrayList;
/**
 * An abstract class describing a Player.
 * The class is used as a superclass to HumanPlayer and ComputerPlayer.
 * 
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 * @param points : number of points the player has
 * @param position : position on the board
 * @param name : the name of the player
 * @param cardsOnHand : an arrayList of the cards the player has on his hand.
 * @param cardsInPile : an arraylist of the cards the player has in his pile.
 * @param turnEnded : a boolean to register if the player has ended his turn
 */
public abstract class Player {
	protected int points = 0;
	protected int position;
	protected String name;
	protected ArrayList<Card> cardsOnHand;
	protected ArrayList<Card> cardsInPile;
	protected Board board;
	protected boolean turnEnded = false;
	
	public boolean isTurnEnded() {
		return turnEnded;
	}
	public void setTurnEnded(boolean turnEnded) {
		this.turnEnded = turnEnded;
	}
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
	private void removeCardFromHand(Card card) {
		cardsOnHand.remove(card);
	}
	/**
	 * a method to "take" cards from the board
	 * @param cardOnHand the card the player takes with
	 * @param cardsOnBoard the cards the player takes
	 */
	public void takeCardFromBoard(Card cardOnHand, ArrayList<Card> cardsOnBoard) {
		addCardToPile(cardOnHand);
		removeCardFromHand(cardOnHand);
		for (Card card : cardsOnBoard) {
			addCardToPile(card);
			board.removeCardFromBoard(card);
			
		}
	}
	/**
	 * a method to add a card from hand to the board
	 * @param cardOnHand the card to add to the board
	 */
	public void addCardToBoard(Card cardOnHand) {
		board.addCardToBoard(cardOnHand);
		removeCardFromHand(cardOnHand);
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
