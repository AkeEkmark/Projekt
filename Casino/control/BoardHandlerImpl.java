package control;

import java.util.ArrayList;

import model.Board;
import model.Card;

public class BoardHandlerImpl implements BoardHandler {
	private Board board;
	
	public BoardHandlerImpl() {
		board = new Board();
	}
	
	@Override
	public ArrayList<Card> getCardsOnBoard() {
		ArrayList<Card> cards = board.getCardsOnBoard();
		return cards;
	}

	@Override
	public void addCardtoBoard(Card card) {
		board.addCardToBoard(card);

	}

	@Override
	public void removeCardFromBoard(Card card) {
		board.removeCardFromBoard(card);

	}
	public Board getBoard() {
		return board;
	}

}
