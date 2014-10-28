package control;

import java.util.ArrayList;

import model.Board;
import model.Card;
import model.Player;

public class PlayerMovesImpl implements PlayerMoves {
	private PlayerHandler playerHandler;
	private BoardHandler boardHandler;
	public PlayerMovesImpl(PlayerHandler playerHandler, BoardHandler boardHandler) {
		this.playerHandler = playerHandler;
		this.boardHandler = boardHandler;
	}

	@Override
	public void takeCardFromBoard(Card cardOnHand, ArrayList<Card> cardsOnBoard, Player player) {
		if (boardHandler.getCardsOnBoard().containsAll(cardsOnBoard) && player.getCardsOnHand().contains(cardOnHand)) {
			player.takeCardFromBoard(cardOnHand, cardsOnBoard);
		}
		else {
			System.out.println("Error, the board or the player does not contain the cards.");
		}

	}

	@Override
	public void addCardToBoard(Card cardOnHand, Player player) {
		if (player.getCardsOnHand().contains(cardOnHand)) {
			player.addCardToBoard(cardOnHand);
		}
		else System.out.println("Error, player does not have that card on hand");
		

	}

}
