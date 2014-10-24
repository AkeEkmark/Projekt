package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class NbrPlayersPanel extends OrangePanel {
	private JRadioButton c1;
	private JRadioButton c2;
	private JRadioButton c3;
	//private JLabel l2;
	private ButtonGroup btngroup;

	public NbrPlayersPanel() {
		c1 = new JButtonBackground("2 players");
		c2 = new JButtonBackground("3 players");
		c3 = new JButtonBackground("4 players");
		//l2 = new JLabel("Number of players");
		btngroup = new ButtonGroup();

		btngroup.add(c1);
		btngroup.add(c2);
		btngroup.add(c3);
		//add(l2);
		add(c1);
		add(c2);
		add(c3);
		setBorder(new PanelBorder("Number of players"));
		setPreferredSize(new Dimension(140, 150));
		setVisible(true);

	}
}
