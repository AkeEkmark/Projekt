package gui.Cosmetics;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
/**
 * A class to create a border.
 * @author �ke Ekmark, Andreas Wieselqvist och Simon S�derh�ll.
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
