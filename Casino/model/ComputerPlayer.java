package model;

import java.util.ArrayList;
/**
 * A class describing a Computer-player.
 * The class is used to construct computer-players.
 * ComputerPlayer is a subclass to Player.
 * 
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 * @param difficulty : the difficulty of the computer-player.
 
 */
public class ComputerPlayer extends Player {
	private int difficulty;
	/**
	 * 
	 * @param name is the name of Computerplayer
	 * @param position is the position on the board
	 * @param difficulty is the difficulty of the Computer-player. 1-3 allowed. 
	 */
	public ComputerPlayer(String name, int position, int difficulty) {
		super.name = name;
		super.position = position;
		this.difficulty = difficulty;
		super.cardsInPile = new ArrayList<Card>();
		super.cardsOnHand = new ArrayList<Card>();
	}
	/**
	 * 
	 * @return the difficulty of the Computer-player
	 */
	public int getDifficulty() {
		return difficulty;
	}
	
}
