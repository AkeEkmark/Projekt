package control;

import javax.swing.JOptionPane;

import model.Card;
import model.ComputerPlayer;
import model.HumanPlayer;
import model.Player;
import gui.Board.Gui;

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
