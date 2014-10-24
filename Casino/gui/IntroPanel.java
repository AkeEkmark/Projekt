package gui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class IntroPanel extends OrangePanel {
	private JLabel i;

	public IntroPanel() {
		i = new JLabel(("<html><font size=12> <font color='green'>Casino</font></html>"));
		
		setBorder(new PanelBorder(""));
		add(i);
		
	}
}
