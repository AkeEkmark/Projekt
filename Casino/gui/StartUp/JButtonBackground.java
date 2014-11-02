package gui.StartUp;

import gui.Cosmetics.Orange;

import javax.swing.JRadioButton;
/**
 * A class to create a radiobutton with an orange background.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class JButtonBackground extends JRadioButton {
	public JButtonBackground(String title){
		super(title);
		setBackground(new Orange());
	}

}
