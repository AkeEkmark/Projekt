package control;

import java.util.ArrayList;

import model.ComputerPlayer;
import model.HumanPlayer;
import model.Player;

public class PlayerHandlerImpl implements PlayerHandler {
	ArrayList<Player> players;
	public PlayerHandlerImpl(int nbrOfOpponents, int difficulty) {
		players = new ArrayList<Player>();
		
	}
	@Override
	public void createHumanPlayer(String name, int position) {
		Player player = new HumanPlayer(name, position);
		players.add(player);

	}

	@Override
	public void createComputerPlayer(String name, int position, int difficulty) {
		Player player = new ComputerPlayer(name, position, difficulty);
		players.add(player);

	}
	public ArrayList<Player> getPlayers() {
		return players;
	}

}
