package gui.StartUp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import control.GameHandler;
/**
 * A frame containing the panels for the game options.
 * listens to the startbutton and creates the GameHandler when pressed.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class StartUpFrame extends JFrame implements ActionListener {

	private StartPanel startPanel;
	private DifficultyPanel difficultyPanel;
	private NbrPlayersPanel nbrPlayersPanel;
	private LengthPanel lengthPanel;
	private IntroPanel introPanel;
	private GameHandler gameHandler;

	public StartUpFrame() {
		startPanel = new StartPanel(this);
		difficultyPanel = new DifficultyPanel();
		nbrPlayersPanel = new NbrPlayersPanel();
		lengthPanel = new LengthPanel();
		introPanel = new IntroPanel();
		add(lengthPanel, BorderLayout.CENTER);
		add(difficultyPanel, BorderLayout.WEST);
		add(nbrPlayersPanel, BorderLayout.EAST);
		add(startPanel, BorderLayout.SOUTH);
		add(introPanel, BorderLayout.NORTH);
		setName("Initial Setup");
		setLocationRelativeTo(null);
		setPreferredSize(new Dimension(600, 300));
		pack();

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startPanel.getStart()) {
			int h = nbrPlayersPanel.getBtn();
			int y = lengthPanel.getBtn();
			int x = difficultyPanel.getBtn();
			if (x == 0) {
				JOptionPane.showMessageDialog(this,
						"You need to choose difficulty", "Do you want a challenge?",
						JOptionPane.WARNING_MESSAGE);
			} else if (y == 0) {
				JOptionPane.showMessageDialog(this,
						"You need to choose victory condition", "How far are you willing to go?",
						JOptionPane.WARNING_MESSAGE);
			} else if (h == 0) {
				JOptionPane.showMessageDialog(this,
						"You need to choose number of players", "2,3,4 it's up to you",
						JOptionPane.WARNING_MESSAGE);
			} else {
				this.setVisible(false);
				new Thread(gameHandler = new GameHandler(h, x, y)).start();;
				
				
			}
		}
	}
}
