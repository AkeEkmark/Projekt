package guicosmetics;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreboardPanel extends JPanel {
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private int player1Score;
	private int player2Score;
	private int player3Score;
	private int player4Score;

	public ScoreboardPanel() {
		l1 = new JLabel("");
		l2 = new JLabel("");
		l3 = new JLabel("");
		l4 = new JLabel("");
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		setPreferredSize(new Dimension(150, 50));
		setBackground(new Boardcolor());
		setVisible(true);
	}

	public void setPlayerScore(int playerScore, int position) {
		if (position == 1){
			player1Score = playerScore;
		}else if (position == 2){
			player2Score = playerScore;
		}else if (position == 3){
			player3Score = playerScore;
		}else if (position == 4){
			player4Score = playerScore;
		}
	}

	

	public void createLabel(String playerName, int position ){
	if (position == 1){
		l1.setText(playerName + " : " +player1Score);
	}else if (position == 2){
		l2.setText(playerName + " : " +player2Score);
	}else if (position == 3){
		l3.setText(playerName + " : " +player3Score);
	}else if (position == 4){
		l4.setText(playerName + " : " +player4Score);
	}
		
	}

	}

