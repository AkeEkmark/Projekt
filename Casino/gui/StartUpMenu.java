package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class StartUpMenu extends JFrame {

	StartPanel startPanel;
	DifficultyPanel difficultyPanel;
	NbrPlayersPanel nbrPlayersPanel;
	LengthPanel lengthPanel;

	public StartUpMenu() {
		startPanel = new StartPanel();
		difficultyPanel = new DifficultyPanel();
		nbrPlayersPanel = new NbrPlayersPanel();
		lengthPanel = new LengthPanel();
		add(lengthPanel, BorderLayout.NORTH);
		add(difficultyPanel, BorderLayout.WEST);
		add(nbrPlayersPanel, BorderLayout.EAST);
		add(startPanel, BorderLayout.SOUTH);
		pack();
        setName("Initial Setup");
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(800, 600));
	
	 setVisible(true);
		 
		
	}

}
