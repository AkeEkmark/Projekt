package gui.StartUp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class StartUpFrame extends JFrame {

	private StartPanel startPanel;
	private DifficultyPanel difficultyPanel;
	private NbrPlayersPanel nbrPlayersPanel;
	private LengthPanel lengthPanel;
	private IntroPanel introPanel;

	public StartUpFrame() {
		startPanel = new StartPanel();
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

}
