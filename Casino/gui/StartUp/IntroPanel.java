package gui.StartUp;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.PanelBorder;

import javax.swing.JLabel;
/**
 * A panel to display the name of the game.
 * @author �ke Ekmark, Andreas Wieselqvist och Simon S�derh�ll.
 *
 */
public class IntroPanel extends ColorPanel {
	private JLabel i;

	public IntroPanel() {
		super("Orange");
		i = new JLabel(("<html><font size=12> <font color='green'>Casino</font></html>"));
		
		setBorder(new PanelBorder(""));
		add(i);
		
	}
}
