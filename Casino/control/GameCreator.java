package control;

import java.util.ArrayList;

import model.Card;
import model.Player;
import gui.Board.BoardFrame;

public class GameCreator {
	private BoardHandler boardHandler;
	private DeckHandler deckHandler;
	private PlayerHandler playerHandler;
	private PlayerMoves playerMoves;
	private PointCounter pointCounter;
	private AiControl aiControl;
	private int nbrOfOpponents;
	private int difficulty;
	private int gameType;
	private BoardFrame boardFrame;
	
	public GameCreator(int nbrOfOpponents, int difficulty, int gameType) {
		this.nbrOfOpponents = nbrOfOpponents;
		this.difficulty = difficulty;
		this.gameType = gameType;
		
	}

	public void createHandlers() {
		deckHandler = new DeckHandlerImpl();
		boardHandler = new BoardHandlerImpl(getBoardFrame());
		playerHandler = new PlayerHandlerImpl(nbrOfOpponents, difficulty, getBoardHandler(), getBoardFrame());
		pointCounter = new PointCounter(getBoardHandler());
		playerMoves = new PlayerMovesImpl(getPlayerHandler(), getBoardHandler(), getPointCounter());
		aiControl = new AiControl(getBoardHandler(), getPlayerMoves());
		
	}

	public BoardHandler getBoardHandler() {
		return boardHandler;
	}

	public DeckHandler getDeckHandler() {
		return deckHandler;
	}

	public PlayerHandler getPlayerHandler() {
		return playerHandler;
	}

	public PlayerMoves getPlayerMoves() {
		return playerMoves;
	}

	public PointCounter getPointCounter() {
		return pointCounter;
	}
	public AiControl getAiControl() {
		return aiControl;
	}

	public int getNbrOfOpponents() {
		return nbrOfOpponents;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public int getGameType() {
		return gameType;
	}
	public void setBoardFrame(BoardFrame boardFrame) {
		this.boardFrame = boardFrame;
	}
	public BoardFrame getBoardFrame() {
		return boardFrame;
	}

	public boolean endPlayerTurn(Player player) {
		ArrayList<Card> cardsToTake = new ArrayList<Card>();
		Card cardFromHand = null;
		boolean move = false;
		for (Card card : boardHandler.getCardsOnBoard()) {
			if (card.isSelected()) {
				cardsToTake.add(card);
			}
		}
		for (Card card : player.getCardsOnHand()) {
			if (card.isSelected()) {
				cardFromHand = card;
			}
		}
		if ((cardsToTake.isEmpty()) && (cardFromHand != null)) {
			move = playerMoves.addCardToBoard(cardFromHand, player);
		}
		else if ((!cardsToTake.isEmpty()) && (cardFromHand != null)){
			move = playerMoves.takeCardFromBoard(cardFromHand, cardsToTake, player);
		}
		
		return move;
	}
}
