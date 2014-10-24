package gui;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProgressPanel extends JPanel {
	private int pileSize = 0;
	private int nbrofSpades = 0;
	private JLabel l1;
	private JLabel l2;

	public ProgressPanel() {
		l1 = new JLabel("Number of cards in pile : " + pileSize);
		l2 = new JLabel("Number of spades in pile : " + nbrofSpades);
		add(l1);
		add(l2);
		setPreferredSize(new Dimension(200, 200));
		setVisible(true);
	}

	public void setPileSize(int pileSize) {
		this.pileSize = pileSize;
	}

	public void setNbrofSpades(int nbrofSpades) {
		this.nbrofSpades = nbrofSpades;
	}
}
