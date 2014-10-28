package gui.Cosmetics;

import javax.swing.JPanel;

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


