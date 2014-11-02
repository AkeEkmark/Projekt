package control;

import gui.Board.ScoreboardPanel;

import java.util.ArrayList;
import java.util.Collections;

import model.Card;
import model.Card.Suit;
import model.Card.Value;
import model.Player;
/**
 * A class to calculate points of moves and at the end of the deck.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class PointCounter {
	private BoardHandler boardHandler;
	private ScoreboardPanel sbp;
	public PointCounter(BoardHandler boardHandler) {
		this.boardHandler = boardHandler;
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
		if (boardHandler.getCardsOnBoard().size() == 0) {
			points++;
		}
		
		addPoints(points, player);
		
	}
	private void addPoints(int points, Player player) {
		player.addPoints(points);
		//sbp.addPlayerScore(points, player.getPosition());
	}
	public void endOfDeck(ArrayList<Player> players) {
		int maxCards;
		int maxSpades;
		ArrayList<Player> mostCards = new ArrayList<Player>();
		ArrayList<Player> mostSpades = new ArrayList<Player>();
		ArrayList<Integer> checkCards = new ArrayList<Integer>();
		ArrayList<Integer> checkSpades = new ArrayList<Integer>();
		for (Player player : players) {
			int spades = 0;
			checkCards.add(player.getCardsInPile().size());
			for (Card card : player.getCardsInPile()) {
				if (card.getSuit() == Suit.SPADE) {
					spades++;
				}
			}
			checkSpades.add(spades);
		}
		maxCards = Collections.max(checkCards);
		maxSpades = Collections.max(checkSpades);
		for (Player player : players) {
			int spades = 0;
			if (player.getCardsInPile().size() == maxCards) {
				mostCards.add(player);
			}
			for (Card card : player.getCardsInPile()) {
				if (card.getSuit() == Suit.SPADE) {
					spades++;
				}
			}
			if (spades == maxSpades) {
				mostSpades.add(player);
			}
		}
		
		for (Player player : mostCards) {
			addPoints(1, player);
		}
		for (Player player : mostSpades) {
			addPoints(1, player);
		}
		for (Player player : players) {
			if (mostCards.contains(player) && (mostSpades.contains(player))) {
				addPoints(1, player);
			}
		}	
	}
	public void setScoreBoard(ScoreboardPanel sbp) {
		this.sbp = sbp;
	}
	
	
}
