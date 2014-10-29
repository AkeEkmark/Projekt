package gui.Board;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import model.Card;
import model.Card.Suit;
import model.Card.Value;

public class BoardFrame extends JFrame{
	private BoardPanel boardPanel;
	private PlayerPanel player1;
	private OpponentPanel player2;
	private OpponentPanel player3;
	private OpponentPanel player4;
	public BoardFrame() {
		setLayout(new BorderLayout());
		boardPanel = new BoardPanel();
		player1 = new PlayerPanel();
		player2 = new OpponentPanel("WEST");
		player3 = new OpponentPanel("EAST");
		player4 = new OpponentPanel("NORTH");
		add(boardPanel, BorderLayout.CENTER);
		add(player1, BorderLayout.SOUTH);
		add(player2, BorderLayout.WEST);
		add(player3, BorderLayout.EAST);
		add(player4, BorderLayout.NORTH);
	player1.addCard(new Card(Suit.CLUB, Value.ACE, "Cards/51.png"));
	player1.addCard(new Card(Suit.CLUB, Value.ACE, "Cards/34.png"));
//		player1.addCard(new Card(Suit.CLUB, Value.ACE, "Cards/1.png"));
//		player1.addCard(new Card(Suit.CLUB, Value.ACE, "Cards/22.png"));
//		boardPanel.addCard(new Card(Suit.CLUB, Value.ACE, "Cards/22.png"));
//		boardPanel.addCard(new Card(Suit.CLUB, Value.ACE, "Cards/22.png"));
//		boardPanel.addCard(new Card(Suit.CLUB, Value.ACE, "Cards/22.png"));
//		boardPanel.addCard(new Card(Suit.CLUB, Value.ACE, "Cards/22.png"));
//		player2.addCard();
//		player2.addCard();
//		player2.addCard();
//		player2.addCard();
//		player4.addCard();
//		player4.addCard();
//		player4.addCard();
//		player4.addCard();
//		player3.addCard();
//		player3.addCard();
//		player3.addCard();
//		player3.addCard();
		setVisible(true);
		setPreferredSize(new Dimension(800, 700));
		
		
		
		pack();
		setVisible(true);
		
	}
}
