package gui.Board;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

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
		
		
		setVisible(true);
		setPreferredSize(new Dimension(800, 700));
		
		
		
		pack();
		setVisible(true);
		
	}
}
