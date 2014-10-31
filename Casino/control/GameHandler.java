package control;

import model.Player;
import gui.Board.Gui;

public class GameHandler {
	private GameCreator gameCreator;
	private Gui gui;

	public GameHandler(int nbrOfOpponents, int difficulty, int gameType) {
		gameCreator = new GameCreator(nbrOfOpponents, difficulty, gameType);
		gui = new Gui(gameCreator);
		gameCreator.setBoardFrame(gui.getBoardFrame());
		gameCreator.createHandlers();
		gui.getBoardFrame().createPanels();
		setUpGame();
		
	}

	private void setUpGame() {
		gameCreator.getDeckHandler().shuffleDeck();
		for (int i = 0; i < 4; i++) {
			gameCreator.getBoardHandler().addCardtoBoard(gameCreator.getDeckHandler().getCard(0));
			for (Player player : gameCreator.getPlayerHandler().getPlayers()) {
				gameCreator.getPlayerHandler().dealCardToPlayer(player, gameCreator.getDeckHandler().getCard(0));
			}
		}
	}
}
