package model;

import java.util.ArrayList;

public class ComputerPlayer extends Player {
	private int difficulty;
	
	public ComputerPlayer(String name, int position, int difficulty) {
		super.name = name;
		super.position = position;
		this.difficulty = difficulty;
		super.cardsInPile = new ArrayList<Card>();
		super.cardsOnHand = new ArrayList<Card>();
	}
	public int getDifficulty() {
		return difficulty;
	}
	
}
