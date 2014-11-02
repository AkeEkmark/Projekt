package control;

import java.util.ArrayList;

import model.Card;
import model.Player;
/**
 * Interface to control and create players.
 * @author �ke Ekmark, Andreas Wieselqvist och Simon S�derh�ll.
 *
 */
public interface PlayerHandler {
	public void createHumanPlayer(String name, int position);
	public void createComputerPlayer(String name, int position, int difficulty);
	public ArrayList<Player> getPlayers();
	public void dealCardToPlayer(Player player, Card card);
}
