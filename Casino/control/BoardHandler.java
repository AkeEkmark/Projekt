package control;

import java.util.ArrayList;

import model.Board;
import model.Card;
/**
 * Interface for the class that controls the board.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public interface BoardHandler {
	public ArrayList<Card> getCardsOnBoard();
	public void addCardtoBoard(Card card);
	public void removeCardFromBoard(Card card);
	public Board getBoard();
}
