package control;

import gui.Board.BoardFrame;
import gui.Board.Players;

import java.util.ArrayList;
import java.util.Random;

import model.Card;
import model.Card.Suit;
import model.Card.Value;
import model.ComputerPlayer;
import model.Player;
/**
 * A class to control the computer-players of the game
 * with references to parts of the program the method needs.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class AiControl {
	private Random random;
	private int difficulty;
	private BoardHandler boardHandler;
	private PlayerMoves playerMoves;
	private BoardFrame boardFrame;
	public AiControl(BoardHandler boardHandler, PlayerMoves playerMoves, BoardFrame boardFrame) {
		this.boardHandler = boardHandler;
		this.playerMoves = playerMoves;
		this.boardFrame = boardFrame;
		random = new Random();
	}
	/**
	 * Analyses the players hand and the board to come up with possible moves.
	 * If there are no moves it plays a card from the hand to the board.
	 * The difficulty of the computer-player determines how "smart" the move will be.
	 * @param player : the computer-player to make the move for.
	 * @return a string describing the move the player did.
	 */
	public String makeMove(Player player) {
		difficulty = ((ComputerPlayer)player).getDifficulty();
		
		ArrayList<AvaliableMoves> avaliableMoves = new ArrayList<AvaliableMoves>();
		ArrayList<Integer> cardsToTake = new ArrayList<Integer>();
		Card cardToAddtoBoard;
		Card cardToTakeCardsWith;
		ArrayList<Card> cardsToTakeFromBoard = new ArrayList<Card>();
		ArrayList<Card> prioCards = new ArrayList<Card>();
		int indexOfCardOnHand = 0;
		int indexOfCardOnBoard = 0;
		switch (difficulty) {
		case 1: 
			for (Card card : player.getCardsOnHand()) {
				for (Card cardOnBoard : boardHandler.getCardsOnBoard()) {
					if (card.getValue() == cardOnBoard.getValue()) {
						cardsToTake.add(indexOfCardOnBoard);
						avaliableMoves.add(new AvaliableMoves(indexOfCardOnHand, cardsToTake, 0));
						
					}
					indexOfCardOnBoard++;
				}
				indexOfCardOnBoard = 0;
				indexOfCardOnHand++;
			}
			if (!avaliableMoves.isEmpty()) {
				System.out.println("moves, trying to take cards from board");
				System.out.println(avaliableMoves.size());
				int rndmIndex = random.nextInt(avaliableMoves.size());
				System.out.println(rndmIndex);
				cardToTakeCardsWith = player.getCardsOnHand().get(avaliableMoves.get(rndmIndex).getCardOnHand());
				for (int i : avaliableMoves.get(rndmIndex).getCardsOnBoard()) {
					cardsToTakeFromBoard.add(boardHandler.getCardsOnBoard().get(i));
				}
				System.out.println("card i want to take with: "+ cardToTakeCardsWith);
				for (Card card : cardsToTakeFromBoard) {
					System.out.println("cards i want to take");
					System.out.println(card.toString());
				}
				
				if (playerMoves.takeCardFromBoard(cardToTakeCardsWith, cardsToTakeFromBoard, player)) {
					for (Card card : cardsToTakeFromBoard) {
						boardFrame.getBoardPanel().removeCard(card);
					}
					boardFrame.getBoardPanel().revalidate();
					ArrayList<Players> players = boardFrame.getPlayers();
					for (Players computer: players) {
						if (computer.getPlayer() == player) {
							computer.removeCard(null);
							
						}
					}
					player.setTurnEnded(true);
					String move = "Computer took : ";
					for (Card card : cardsToTakeFromBoard) {
						move +=card.toString() + " , ";
					}
					move +=" with : " +cardToTakeCardsWith.toString();
					return move;
				}
				else {
					//ful lösning på en bugg
					System.out.println("no moves, trying to put card on board");
					cardToAddtoBoard = player.getCardsOnHand().get(random.nextInt(player.getCardsOnHand().size()));
					if (playerMoves.addCardToBoard(cardToAddtoBoard, player)) {
						boardFrame.getBoardPanel().addCard(cardToAddtoBoard);
						boardFrame.getBoardPanel().revalidate();
						ArrayList<Players> players = boardFrame.getPlayers();
						for (Players computer: players) {
							if (computer.getPlayer() == player) {
								computer.removeCard(null);
								
							}
						}
						player.setTurnEnded(true);
						String move = "Computer put "+ cardToAddtoBoard.toString() +" to the board";
						return move;
					}
				}
			}
			else {
				System.out.println("no moves, trying to put card on board");
				cardToAddtoBoard = player.getCardsOnHand().get(random.nextInt(player.getCardsOnHand().size()));
				if (playerMoves.addCardToBoard(cardToAddtoBoard, player)) {
					boardFrame.getBoardPanel().addCard(cardToAddtoBoard);
					boardFrame.getBoardPanel().revalidate();
					ArrayList<Players> players = boardFrame.getPlayers();
					for (Players computer: players) {
						if (computer.getPlayer() == player) {
							computer.removeCard(null);
							
						}
					}
					player.setTurnEnded(true);
					String move = "Computer put "+ cardToAddtoBoard.toString() +" to the board";
					return move;
				}
			}
			
			break;
		case 2:
			for (Card cardOnBoard : boardHandler.getCardsOnBoard()) {
				if (cardOnBoard.getSuit() == Suit.DIAMOND && cardOnBoard.getValue() == Value.TEN) {
					prioCards.add(cardOnBoard);
				}
				if (cardOnBoard.getSuit() == Suit.SPADE && cardOnBoard.getValue() == Value.TWO) {
					prioCards.add(cardOnBoard);
				}
				if (cardOnBoard.getValue() == Value.ACE) {
					prioCards.add(cardOnBoard);
				}
				
			}
			
			
			break;
		case 3:
			
			break;
		default:
			break;
		}
		avaliableMoves.clear();
		return "no moves avaliable";
	}
	/**
	 * An inner class to save the possible moves.
	 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
	 *
	 */
	public class AvaliableMoves {
		private int cardOnHand;
		private ArrayList<Integer> cardsOnBoard;
		private int points;
		public AvaliableMoves(int cardOnHand, ArrayList<Integer> cardsOnBoard, int points) {
			this.cardOnHand = cardOnHand;
			this.cardsOnBoard = cardsOnBoard;
			this.points = points;
		}
		public int getCardOnHand() {
			return cardOnHand;
		}
		public ArrayList<Integer> getCardsOnBoard() {
			return cardsOnBoard;
		}
		public int getPoints() {
			return points;
		}
	}
}

