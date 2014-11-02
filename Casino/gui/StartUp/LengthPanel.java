package gui.StartUp;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.PanelBorder;

import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
/**
 * A panel to choose the lenght of the game.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class LengthPanel extends ColorPanel {
	private JRadioButton d1;
	private JRadioButton d2;
	private JRadioButton d3;
	private JRadioButton p1;
	private JRadioButton p2;
	private JRadioButton p3;
	// private JLabel i;
	private JPanel panel1;
	private JPanel panel2;
	private ButtonGroup btngroup;

	public LengthPanel() {
		super("Orange");
		d1 = new JButtonBackground("One deck");
		d2 = new JButtonBackground("Two decks");
		d3 = new JButtonBackground("Three decks");
		p1 = new JButtonBackground("15 points");
		p2 = new JButtonBackground("20 points");
		p3 = new JButtonBackground("30 points");

		panel1 = new ColorPanel("Orange");
		panel2 = new ColorPanel("Orange");

		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));

		btngroup = new ButtonGroup();
		btngroup.add(d1);
		btngroup.add(d2);
		btngroup.add(d3);

		btngroup.add(p1);
		btngroup.add(p2);
		btngroup.add(p3);

		add(panel1);
		add(panel2);

		panel1.add(d1);
		panel1.add(d2);
		panel1.add(d3);

		panel2.add(p1);
		panel2.add(p2);
		panel2.add(p3);
		setBorder(new PanelBorder("Victory Condition"));
		setPreferredSize(new Dimension(300, 250));

		setVisible(true);

	}

	public int getBtn() {	
		if (d1.isSelected()){
			return 1;				
		}
		if(d2.isSelected()){
			return 2;
		}
		if(d3.isSelected()){
			return 3;
		}
		if (p1.isSelected()){
			return 4;
				
		}
		if(p2.isSelected()){
			return 5;
		}
		if(p3.isSelected()){
			return 6;
		}
		return 0;
	}

}
