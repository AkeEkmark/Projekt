package control;

import java.util.ArrayList;

import model.Board;
import model.Card;
import model.Card.Value;
import model.Player;

public class PlayerMovesImpl implements PlayerMoves {
	private PlayerHandler playerHandler;
	private BoardHandler boardHandler;
	private PointCounter pointCounter;
	public PlayerMovesImpl(PlayerHandler playerHandler, BoardHandler boardHandler, PointCounter pointCounter) {
		this.playerHandler = playerHandler;
		this.boardHandler = boardHandler;
		this.pointCounter = pointCounter;
	}

	@Override
	public boolean takeCardFromBoard(Card cardOnHand, ArrayList<Card> cardsOnBoard, Player player) {
		int valueOfHand = 0;
		int valueOfHandAce = 0;
		int valueOfBoard = 0;
		int valueOfBoardAce = 0;
		boolean handOk = false;
		if (boardHandler.getCardsOnBoard().containsAll(cardsOnBoard) && player.getCardsOnHand().contains(cardOnHand)) {
			valueOfHand = cardOnHand.getValue().value();
			if (cardOnHand.getValue() == Value.ACE) {
				valueOfHandAce = 14;
			}
			for (Card card : cardsOnBoard) {
				if (card.getValue() == Value.ACE) {
					valueOfBoardAce += 14;
					valueOfBoard += card.getValue().value();
				}
				else {
					valueOfBoardAce += card.getValue().value();
					valueOfBoard += card.getValue().value();
				}
				
			}
			if (valueOfHandAce == 0){
				if ((valueOfBoard % valueOfHand == 0) || (valueOfBoardAce % valueOfHand == 0)) {
					handOk = true;
				}
			}
			else {
				if ((valueOfBoard % valueOfHand == 0) || (valueOfBoardAce % valueOfHand == 0) || (valueOfBoard % valueOfHandAce == 0) || (valueOfBoardAce % valueOfHandAce == 0)) {
					handOk = true;
				}
				
			}
			if (handOk) {
				System.out.println("trying to take cards");
				player.takeCardFromBoard(cardOnHand, cardsOnBoard);
				ArrayList<Card> allCards = new ArrayList<Card>();
				allCards.add(cardOnHand);
				allCards.addAll(cardsOnBoard);
				pointCounter.calculatePoints(allCards, player);
				return true;
			}
			
		}
		
		return false;

	}

	@Override
	public boolean addCardToBoard(Card cardOnHand, Player player) {
		if (player.getCardsOnHand().contains(cardOnHand)) {
			System.out.println("trying to put card on board");
			player.addCardToBoard(cardOnHand);
			
			return true;
		}
		
		return false;
		

	}

}
