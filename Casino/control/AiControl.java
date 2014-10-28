package control;

import java.util.ArrayList;



import java.util.Random;

import model.Board;
import model.Card;
import model.Player;
import model.ComputerPlayer;

public class AiControl {
	private Random random;
	private int difficulty;
	private BoardHandler boardHandler;
	private PlayerMoves playerMoves;
	public AiControl(BoardHandler boardHandler) {
		this.boardHandler = boardHandler;
		random = new Random();
	}
	public void makeMove(Player player) {
		difficulty = ((ComputerPlayer) player).getDifficulty();
		
		ArrayList<AvaliableMoves> avaliableMoves = new ArrayList<AvaliableMoves>();
		ArrayList<Integer> cardsToTake = new ArrayList<Integer>();
		Card cardToAddtoBoard;
		Card cardToTakeCardsWith;
		ArrayList<Card> cardsToTakeFromBoard = new ArrayList<Card>();
		int indexOfCardOnHand = 0;
		int indexOfCardOnBoard = 0;
		switch (difficulty) {
		case 1: 
			for (Card card : player.getCardsOnHand()) {
				for (Card cardOnBoard : boardHandler.getCardsOnBoard()) {
					if (card.getValue() == cardOnBoard.getValue()) {
						cardsToTake.add(indexOfCardOnBoard);
						avaliableMoves.add(new AvaliableMoves(indexOfCardOnHand, cardsToTake));
						indexOfCardOnBoard++;
					}
				}
				indexOfCardOnHand++;
			}
			if (avaliableMoves.size() == 0) {
				cardToAddtoBoard = player.getCardsOnHand().get(random.nextInt(player.getCardsOnHand().size()));
				playerMoves.addCardToBoard(cardToAddtoBoard, player);
			}
			
			else if (avaliableMoves.size() > 0) {
				int rndmIndex = random.nextInt(avaliableMoves.size());
				cardToTakeCardsWith = player.getCardsOnHand().get(avaliableMoves.get(rndmIndex).getCardOnHand());
				for (int i : avaliableMoves.get(rndmIndex).cardsOnBoard) {
					cardsToTakeFromBoard.add(boardHandler.getCardsOnBoard().get(i));
				}
				playerMoves.takeCardFromBoard(cardToTakeCardsWith, cardsToTakeFromBoard, player);
			}
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		default:
			break;
		}
	}
	public class AvaliableMoves {
		private int cardOnHand;
		private ArrayList<Integer> cardsOnBoard;
		
		public AvaliableMoves(int cardOnHand, ArrayList<Integer> cardsOnBoard) {
			this.cardOnHand = cardOnHand;
			this.cardsOnBoard = cardsOnBoard;
		}
		public int getCardOnHand() {
			return cardOnHand;
		}
		public ArrayList<Integer> getCardsOnBoard() {
			return cardsOnBoard;
		}
	}
}

