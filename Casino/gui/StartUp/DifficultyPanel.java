package gui.StartUp;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.PanelBorder;

import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
/**
 * A panel to choose the difficulty.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class DifficultyPanel extends ColorPanel {
	private JRadioButton c1;
	private JRadioButton c2;
	private JRadioButton c3;
	
	private ButtonGroup btngroup;

	public DifficultyPanel() {
		super("Orange");
		c1 = new JButtonBackground("Beginner");
		c2 = new JButtonBackground("Normal");
		c3 = new JButtonBackground("Advanced");

		btngroup = new ButtonGroup();
		btngroup.add(c1);
		btngroup.add(c2);
		btngroup.add(c3);

		add(c1);
		add(c2);
		add(c3);
		setBorder(new PanelBorder("Difficulty"));
		setPreferredSize(new Dimension(140, 150));
		setVisible(true);
	}
	public int getBtn(){
		if (c1.isSelected()){
			return 1;				
		}
		if(c2.isSelected()){
			return 2;
		}
		if(c3.isSelected()){
			return 3;
		}
		return 0;
	}
}
