package gui;

import guicosmetics.BackCardPanel;
import guicosmetics.Boardcolor;
import guicosmetics.PanelBorder;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class OpponentPanel extends JPanel {
	private String position;

	public OpponentPanel(String position) {

		setBorder(new PanelBorder(""));
		this.position = position;
		if (position == "NORTH"){
			setPreferredSize(new Dimension(100, 150));
		
	}else {
			setPreferredSize(new Dimension(150, 336));
		
		}
		setBackground(new Boardcolor());
		setVisible(true);
	}
	public void addCard(){
		add(new BackCardPanel(position));
	}
}
