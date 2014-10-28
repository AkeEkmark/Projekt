package gui.Board;

import gui.Cosmetics.Green;
import gui.Cosmetics.PanelBorder;

import java.awt.Color;
import java.awt.Dimension;
import gui.Cosmetics.ColorPanel;
import javax.swing.JPanel;

public class OpponentPanel extends ColorPanel {
	private String position;

	public OpponentPanel(String position) {
		super("Green");

		setBorder(new PanelBorder(""));
		this.position = position;
		if (position == "NORTH"){
			setPreferredSize(new Dimension(100, 150));
		
	}else {
			setPreferredSize(new Dimension(150, 336));
		
		}
		
		setVisible(true);
	}
	public void addCard(){
		add(new BackCardPanel(position));
	}
}
