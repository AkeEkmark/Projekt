package control;

public class GameCreator {
	BoardHandler boardHandler;
	DeckHandler deckHandler;
	PlayerHandler playerHandler;
	PlayerMoves playerMoves;
	PointCounter pointCounter;
	int nbrOfOpponents;
	int difficulty;
	int gameType;
	
	public GameCreator(int nbrOfOpponents, int difficulty, int gameType ) {
		this.nbrOfOpponents = nbrOfOpponents;
		this.difficulty = difficulty;
		this.gameType = gameType;
		deckHandler = new DeckHandlerImpl();
		boardHandler = new BoardHandlerImpl();
		playerHandler = new PlayerHandlerImpl(nbrOfOpponents, difficulty);
		playerMoves = new PlayerMovesImpl(playerHandler.getPlayers());
		pointCounter = new PointCounter(boardHandler.getBoard());
		
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

	public int getNbrOfOpponents() {
		return nbrOfOpponents;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public int getGameType() {
		return gameType;
	}
	
}
