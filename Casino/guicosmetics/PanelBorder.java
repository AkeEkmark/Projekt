package guicosmetics;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
public class PanelBorder extends TitledBorder {
	 static Border blackline = BorderFactory.createLineBorder(Color.BLACK);

	public PanelBorder( String title) {
		super(blackline, title);
		setTitlePosition(CENTER);
		setTitleJustification(CENTER);
		setTitleColor(Color.black);
	}

	

}
