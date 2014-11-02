package gui.StartUp;

import gui.Cosmetics.Orange;

import javax.swing.JRadioButton;
/**
 * A class to create a radiobutton with an orange background.
 * @author �ke Ekmark, Andreas Wieselqvist och Simon S�derh�ll.
 *
 */
public class JButtonBackground extends JRadioButton {
	public JButtonBackground(String title){
		super(title);
		setBackground(new Orange());
	}

}
