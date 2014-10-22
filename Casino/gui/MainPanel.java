package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	BoardPanel boardPanel;
	PlayerPanel player1;
	OpponentPanel player2;
	OpponentPanel player3;
	OpponentPanel player4;
	public MainPanel() {
		setLayout(new BorderLayout());
		boardPanel = new BoardPanel();
		player1 = new PlayerPanel();
		player2 = new OpponentPanel();
		player3 = new OpponentPanel();
		player4 = new OpponentPanel();
		add(boardPanel, BorderLayout.CENTER);
		add(player1, BorderLayout.SOUTH);
		add(player2, BorderLayout.WEST);
		add(player3, BorderLayout.EAST);
		add(player4, BorderLayout.NORTH);
		setPreferredSize(new Dimension(800, 600));
		setVisible(true);
	}
}
