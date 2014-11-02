package control;

import gui.Board.BoardFrame;

import java.util.ArrayList;

import model.Board;
import model.Card;
/**
 * Implementation of the interface to control the board and keep a reference of the board.
 * Can also add and remove gui elements from the board.
 * @author Åke
 *
 */
public class BoardHandlerImpl implements BoardHandler {
	private Board board;
	private BoardFrame boardFrame;
	
	public BoardHandlerImpl(BoardFrame boardFrame) {
		board = new Board();
		this.boardFrame = boardFrame;
	}
	
	@Override
	public ArrayList<Card> getCardsOnBoard() {
		ArrayList<Card> cards = board.getCardsOnBoard();
		return cards;
	}

	@Override
	public void addCardtoBoard(Card card) {
		board.addCardToBoard(card);
		boardFrame.addCardToBoard(card);

	}

	@Override
	public void removeCardFromBoard(Card card) {
		board.removeCardFromBoard(card);
		boardFrame.removeCardFromBoard(card);

	}
	@Override
	public Board getBoard() {
		return board;
	}

}
