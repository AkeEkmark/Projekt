package control;

import gui.Board.BoardFrame;

import java.util.ArrayList;

import model.Card;
import model.ComputerPlayer;
import model.HumanPlayer;
import model.Player;
/**
 * Implements the interface to control and create players.
 * Keeps a reference of the players.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class PlayerHandlerImpl implements PlayerHandler {
	private ArrayList<Player> players;
	private BoardHandler boardHandler;
	private BoardFrame boardFrame;
	public PlayerHandlerImpl(int nbrOfOpponents, int difficulty, BoardHandler boardHandler, BoardFrame boardFrame) {
		players = new ArrayList<Player>();
		this.boardHandler = boardHandler;
		this.boardFrame = boardFrame;
		createHumanPlayer("Player", 1);
		for (int i = 0; i < nbrOfOpponents; i++) {
			String Computername = "Computer"+(i+1);
			createComputerPlayer(Computername, i+2, difficulty);
		}
	}
	@Override
	public void createHumanPlayer(String name, int position) {
		Player player = new HumanPlayer(name, position);
		player.setBoard(boardHandler.getBoard());
		players.add(player);
		

	}

	@Override
	public void createComputerPlayer(String name, int position, int difficulty) {
		Player player = new ComputerPlayer(name, position, difficulty);
		player.setBoard(boardHandler.getBoard());
		players.add(player);
		

	}
	@Override
	public ArrayList<Player> getPlayers() {
		return players;
	}
	@Override
	public void dealCardToPlayer(Player player, Card card) {
		player.dealCardToHand(card);
		boardFrame.dealCardToPlayer(player,card);
	}

}
