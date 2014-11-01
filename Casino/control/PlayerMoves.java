package control;

import java.util.ArrayList;

import model.Card;
import model.Player;

public interface PlayerMoves {
	public boolean takeCardFromBoard(Card cardOnHand, ArrayList<Card> cardsOnBoard, Player player);
	public boolean addCardToBoard(Card cardOnHand, Player player);
}
