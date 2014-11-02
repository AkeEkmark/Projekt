package gui.Cosmetics;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
/**
 * A class to create a border.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class PanelBorder extends TitledBorder {
	 static Border blackline = BorderFactory.createLineBorder(Color.BLACK);

	public PanelBorder( String title) {
		super(blackline, title);
		setTitlePosition(CENTER);
		setTitleJustification(CENTER);
		setTitleColor(Color.black);
	}

	

}
