package control;

import java.util.ArrayList;

import model.Card;
import model.Player;

public interface PlayerMoves {
	public void takeCardFromBoard(Card cardOnHand, ArrayList<Card> cardsOnBoard, Player player);
	public void addCardToBoard(Card cardOnHand, Player player);
}
