package gui.Board;

import model.Card;
import model.Player;

public interface Players {
	public Player getPlayer();
	public void addCard(Card card);
	public void removeCard(Card card);
}
