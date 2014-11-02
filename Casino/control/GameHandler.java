package control;

import gui.Board.Gui;

import javax.swing.JOptionPane;

import model.Player;
/**
 * A class create and set up the game after the user has choosen the game options.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class GameHandler implements Runnable{
	public class MonitorObject {
		
	}

	private GameCreator gameCreator;
	private Gui gui;
	

	
	public GameHandler(int nbrOfOpponents, int difficulty, int gameType) {
		gameCreator = new GameCreator(nbrOfOpponents, difficulty, gameType);
		(new Thread(gui = new Gui(gameCreator))).start();
		
		gameCreator.setBoardFrame(gui.getBoardFrame());
		gameCreator.createHandlers();
		gui.getBoardFrame().createPanels();
		setUpGame();
		JOptionPane.showMessageDialog(gui.getBoardFrame(), "It's your turn to start the game, press space when you have selected cards to play");
		
		
	}
	/**
	 * deals the starting cards to the players and the board.
	 */
	private void setUpGame() {
		gameCreator.getDeckHandler().shuffleDeck();
		for (int i = 0; i < 4; i++) {
			gameCreator.getBoardHandler().addCardtoBoard(gameCreator.getDeckHandler().getCard(0));
			for (Player player : gameCreator.getPlayerHandler().getPlayers()) {
				gameCreator.getPlayerHandler().dealCardToPlayer(player, gameCreator.getDeckHandler().getCard(0));
			}
		}
	}
	
	

	@Override
	public void run() {
		
		
	}
	
	
}
