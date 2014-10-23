package control;

import java.util.ArrayList;

import model.Board;
import model.Card;
import model.Player;

public class PointCounter {
	Board board;
	public PointCounter(Board board) {
		this.board = board;
	}
	public void calculatePoints(ArrayList<Card> cards, Player player) {
		int points = 0;
		
	}
	private void addPoints(int points, Player player) {
		player.addPoints(points);
	}
}
