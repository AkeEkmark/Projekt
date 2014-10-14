package model;

import java.util.ArrayList;

public abstract class Player {
	private int points = 0;
	private int position;
	private String name;
	private ArrayList<Card> cardsOnHand;
	private ArrayList<Card> cardsInPile;
	
	public void addPoints(int points) {
		this.points += points;
	}
	public ArrayList<Card> getCardsOnHand() {
		return cardsOnHand;
	}
	public ArrayList<Card> getCardsInPile() {
		return cardsInPile;
	}
	public void DealCardToHand(Card card) {
		cardsOnHand.add(card);
	}
}
