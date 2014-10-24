package control;

import java.util.ArrayList;

import model.Board;
import model.Card;
import model.Card.Suit;
import model.Card.Value;
import model.Player;

public class PointCounter {
	private Board board;
	public PointCounter(Board board) {
		this.board = board;
	}
	public void calculatePoints(ArrayList<Card> cards, Player player) {
		int points = 0;
		for (Card card: cards) {
			if (card.getSuit() == Suit.SPADE && card.getValue() == Value.TWO) {
				points++;
			}
			if (card.getSuit() == Suit.DIAMOND && card.getValue() == Value.TEN) {
				points+=2;
			}
			if (card.getValue() == Value.ACE) {
				points++;
			}
		}
		if (board.getCardsOnBoard().size() == 0) {
			points++;
		}
		
		addPoints(points, player);
		
	}
	private void addPoints(int points, Player player) {
		player.addPoints(points);
	}
}
