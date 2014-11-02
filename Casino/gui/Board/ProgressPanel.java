package gui.Board;

import gui.Cosmetics.Green;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * A panel to display the amount of cards and spades the player has.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
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
		setBackground(new Green());

		setVisible(true);
	}

	public void setPileSize(int pileSize) {
		this.pileSize = pileSize;
	}

	public void setNbrofSpades(int nbrofSpades) {
		this.nbrofSpades = nbrofSpades;
	}
}
