package control;

import java.util.ArrayList;

import model.Player;

public class PlayerHandlerImpl implements PlayerHandler {
	ArrayList<Player> players;
	public PlayerHandlerImpl() {
		
	}
	@Override
	public void createHumanPlayer(String name, int position) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createComputerPlayer(String name, int position, int difficulty) {
		// TODO Auto-generated method stub

	}
	public ArrayList<Player> getPlayers() {
		return players;
	}

}
