package model;

public class Card {
	public enum Suit { HEART, SPADE, CLUB, DIAMOND }; 
	public enum Value { ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
	private final int value;
	Value(int value){
		this.value = value;
	}
	public int value(){
		return value;
	}
	};
	private Suit suit;
	private Value value;
	private String fileName;
	private boolean isSelected;
	
	public Card(Suit suit, Value value, String fileName) {
		this.suit = suit;
		this.value = value;
		this.fileName = fileName;
		this.isSelected = false;
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
		return value +" of " +suit;
	}
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected() {
		isSelected = true;
	}
	public void setNotSelected() {
		isSelected = false;
	}
}
