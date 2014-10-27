package control;

import java.util.ArrayList;

import model.Card;
import model.Player;

public class PlayerMovesImpl implements PlayerMoves {
	private ArrayList<Player> players;
	public PlayerMovesImpl(ArrayList<Player> players) {
		this.players = players;
	}

	@Override
	public void takeCardFromBoard(Card cardOnHand, ArrayList<Card> cardsOnBoard, Player player) {
		
		player.takeCardFromBoard(cardOnHand, cardsOnBoard);

	}

	@Override
	public void addCardToBoard(Card cardOnHand, Player player) {
		player.addCardToBoard(cardOnHand);

	}

}
