package control;

public class GameCreator {
	private BoardHandler boardHandler;
	private DeckHandler deckHandler;
	private PlayerHandler playerHandler;
	private PlayerMoves playerMoves;
	private PointCounter pointCounter;
	private int nbrOfOpponents;
	private int difficulty;
	private int gameType;
	
	public GameCreator(int nbrOfOpponents, int difficulty, int gameType ) {
		this.nbrOfOpponents = nbrOfOpponents;
		this.difficulty = difficulty;
		this.gameType = gameType;
		deckHandler = new DeckHandlerImpl();
		boardHandler = new BoardHandlerImpl();
		playerHandler = new PlayerHandlerImpl(nbrOfOpponents, difficulty, boardHandler.getBoard());
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
