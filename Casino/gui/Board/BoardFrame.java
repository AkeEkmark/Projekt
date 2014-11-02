package gui.Board;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;

import model.Card;
import model.Player;
import control.GameCreator;
/**
 * A Frame to keep all the panels of the board.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class BoardFrame extends JFrame{
	private BoardPanel boardPanel;
	private PlayerPanel player1;
	private OpponentPanel player2;
	private OpponentPanel player3;
	private OpponentPanel player4;
	private GameCreator gameCreator;
	private ArrayList<Players> players;
	public BoardFrame(GameCreator gameCreator) {
		this.gameCreator = gameCreator;
		players = new ArrayList<Players>();
		setLayout(new BorderLayout());
		
		setPreferredSize(new Dimension(900, 800));
		pack();
		setVisible(true);
		
	}
	public void createPanels() {
		boardPanel = new BoardPanel(gameCreator, this);
		add(boardPanel, BorderLayout.CENTER);
		player1 = new PlayerPanel(gameCreator.getPlayerHandler().getPlayers().get(0));
		players.add(player1);
		add(player1, BorderLayout.SOUTH);
		player2 = new OpponentPanel("NORTH", gameCreator.getPlayerHandler().getPlayers().get(1));
		players.add(player2);
		add(player2, BorderLayout.NORTH);
		
		if (gameCreator.getNbrOfOpponents() > 1) {
			player3 = new OpponentPanel("EAST", gameCreator.getPlayerHandler().getPlayers().get(2));
			players.add(player3);
			add(player3, BorderLayout.EAST);
		}
		
		if (gameCreator.getNbrOfOpponents() > 2) {
			player4 = new OpponentPanel("WEST", gameCreator.getPlayerHandler().getPlayers().get(3));
			players.add(player4);
			add(player4, BorderLayout.WEST);
		}
		//boardPanel.addScoreBoard();
	}
	public PlayerPanel getPlayer1() {
		return player1;
	}
	public OpponentPanel getPlayer2() {
		return player2;
	}
	public OpponentPanel getPlayer3() {
		return player3;
	}
	public OpponentPanel getPlayer4() {
		return player4;
	}
	public BoardPanel getBoardPanel() {
		return boardPanel;
	}
	public void addCardToBoard(Card card) {
		boardPanel.addCard(card);
		
	}
	public void removeCardFromBoard(Card card) {
		boardPanel.removeCard(card);
		
	}
	public void dealCardToPlayer(Player player, Card card) {
		for (Players panel: players) {
			if (panel.getPlayer() == player) {
				panel.addCard(card);
			}
		}
		
	}
	public ArrayList<Players> getPlayers() {
		return players;
	}
	
}
