package model;

public class Card {
	public enum Suit { HEART, SPADE, CLUB, DIAMOND }; 
	public enum Value { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING };
	private Suit suit;
	private Value value;
	private String fileName;
	
	public Card(Suit suit, Value value, String fileName) {
		this.suit = suit;
		this.value = value;
		this.fileName = fileName;
	}

	public Suit getSuit() {
		return suit;
	}

	public Value getValue() {
		return value;
	}
	public String getFileName() {
		return fileName;
	}
	public String toString() {
		return "Card of Suit: " +suit +" and Value: " +value;
	}
}
