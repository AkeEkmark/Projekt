package control;

import java.util.ArrayList;

import model.Player;

public interface PlayerHandler {
	public void createHumanPlayer(String name, int position);
	public void createComputerPlayer(String name, int position, int difficulty);
	public ArrayList<Player> getPlayers();
}
