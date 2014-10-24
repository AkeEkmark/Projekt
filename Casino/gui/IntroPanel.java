package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class IntroPanel extends JPanel {
	private JLabel i;

	public IntroPanel() {
		i = new JLabel("Casino");
		setBorder(new PanelBorder(""));
		add(i);
	}
}
