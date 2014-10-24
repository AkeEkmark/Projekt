package control;

import java.util.ArrayList;

import model.Board;
import model.ComputerPlayer;
import model.HumanPlayer;
import model.Player;

public class PlayerHandlerImpl implements PlayerHandler {
	private ArrayList<Player> players;
	private Board board;
	public PlayerHandlerImpl(int nbrOfOpponents, int difficulty, Board board) {
		players = new ArrayList<Player>();
		
	}
	@Override
	public void createHumanPlayer(String name, int position) {
		Player player = new HumanPlayer(name, position);
		player.setBoard(board);
		players.add(player);

	}

	@Override
	public void createComputerPlayer(String name, int position, int difficulty) {
		Player player = new ComputerPlayer(name, position, difficulty);
		player.setBoard(board);
		players.add(player);

	}
	@Override
	public ArrayList<Player> getPlayers() {
		return players;
	}

}
