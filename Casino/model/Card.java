package model;
/**
 * A class describing a playing-card.
 * The class is used to construct playing-cards.
 * 
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 * @param Suit : enum for the suit of the card.
 * @param Value : enum for the the value of the card.
 * @param isSelected : boolean if the card is selected in the gui.
 * @param fileName : the filename for the image of the card
 */
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
	/**
	 * Constructor.
	 * @param suit : suit of the card
	 * @param value : value of the card
	 * @param fileName : the filename for the image of the card
	 */
	public Card(Suit suit, Value value, String fileName) {
		this.suit = suit;
		this.value = value;
		this.fileName = fileName;
		this.isSelected = false;
	}
	/**
	 * 
	 * @return the suit of the card
	 */
	public Suit getSuit() {
		return suit;
	}
	/**
	 * 
	 * @return the value of the card
	 */
	public Value getValue() {
		return value;
	}
	/**
	 * 
	 * @return the filename of the image for the card
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @return a string representation of the card
	 */
	public String toString() {
		return value +" of " +suit;
	}
	/**
	 * 
	 * @return if the card is selected
	 */
	public boolean isSelected() {
		return isSelected;
	}
	/**
	 * isSelected = true;
	 */
	public void setSelected() {
		isSelected = true;
	}
	/**
	 * isSelected = false;
	 */
	public void setNotSelected() {
		isSelected = false;
	}
}
