package guicosmetics;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProgressPanel extends JPanel {
	private int pileSize = 0;
	private int nbrofSpades = 0;
	private JLabel l1;
	private JLabel l2;
	private String nbrcards = "Number of cards in pile : " + pileSize;
	private String nbrspades = "Number of spades in pile : " + nbrofSpades;

	public ProgressPanel() {

		l1 = new JLabel(nbrcards);
		l2 = new JLabel(nbrspades);
		add(l1);
		add(l2);
		setPreferredSize(new Dimension(200, 50));
		setBackground(new Boardcolor());

		setVisible(true);
	}

	public void setPileSize(int pileSize) {
		this.pileSize = pileSize;
	}

	public void setNbrofSpades(int nbrofSpades) {
		this.nbrofSpades = nbrofSpades;
	}
}
