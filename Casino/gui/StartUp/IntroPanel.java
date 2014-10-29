package gui.StartUp;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.PanelBorder;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class IntroPanel extends ColorPanel {
	private JLabel i;

	public IntroPanel() {
		super("Orange");
		i = new JLabel(("<html><font size=12> <font color='green'>Casino</font></html>"));
		
		setBorder(new PanelBorder(""));
		add(i);
		
	}
}
