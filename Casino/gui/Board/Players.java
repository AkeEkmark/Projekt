package gui.Board;

import model.Card;
import model.Player;
/**
 * Interface for the player and opponents panels.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public interface Players {
	public Player getPlayer();
	public void addCard(Card card);
	public void removeCard(Card card);
	public void revalidate();
	public void repaint();
}
