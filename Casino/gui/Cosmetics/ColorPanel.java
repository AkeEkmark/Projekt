package gui.Cosmetics;

import javax.swing.JPanel;
/**
 * A class to create a panel with a background color.
 * @author �ke Ekmark, Andreas Wieselqvist och Simon S�derh�ll.
 *
 */
public class ColorPanel extends JPanel {
	public ColorPanel(String color){
		if (color == "Green") {
			setBackground(new Green());
		}
		if (color == "Orange") {
			setBackground(new Orange());
		}
		
	}

}


