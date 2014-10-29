package control;

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
	
	public GameCreator(int nbrOfOpponents, int difficulty, int gameType ) {
		this.nbrOfOpponents = nbrOfOpponents;
		this.difficulty = difficulty;
		this.gameType = gameType;
		deckHandler = new DeckHandlerImpl();
		boardHandler = new BoardHandlerImpl();
		playerHandler = new PlayerHandlerImpl(nbrOfOpponents, difficulty, getBoardHandler());
		playerMoves = new PlayerMovesImpl(getPlayerHandler(), getBoardHandler());
		pointCounter = new PointCounter(getBoardHandler());
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
}
