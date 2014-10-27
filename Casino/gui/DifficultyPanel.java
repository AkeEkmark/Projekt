package gui;

import guicosmetics.JButtonBackground;
import guicosmetics.OrangePanel;
import guicosmetics.PanelBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DifficultyPanel extends OrangePanel {
	private JRadioButton c1;
	private JRadioButton c2;
	private JRadioButton c3;
	// private JLabel l1;
	private ButtonGroup btngroup;

	public DifficultyPanel() {
		c1 = new JButtonBackground("Beginner");
		c2 = new JButtonBackground("Normal");
		c3 = new JButtonBackground("Advanced");
		// l1 = new JLabel("Choose Level");

		btngroup = new ButtonGroup();
		btngroup.add(c1);
		btngroup.add(c2);
		btngroup.add(c3);
		// add(l1);

		add(c1);
		add(c2);
		add(c3);
		setBorder(new PanelBorder("Difficulty"));
		setPreferredSize(new Dimension(140, 150));
		setVisible(true);
	}

}
