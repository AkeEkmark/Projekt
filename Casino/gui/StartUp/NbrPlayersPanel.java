package gui.StartUp;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.PanelBorder;

import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
/**
 * A panel to choose the number of players.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class NbrPlayersPanel extends ColorPanel {
	private JRadioButton c1;
	private JRadioButton c2;
	private JRadioButton c3;
	//private JLabel l2;
	private ButtonGroup btngroup;

	public NbrPlayersPanel() {
		super("Orange");
		c1 = new JButtonBackground("2 players");
		c2 = new JButtonBackground("3 players");
		c3 = new JButtonBackground("4 players");
		//l2 = new JLabel("Number of players");
		btngroup = new ButtonGroup();

		btngroup.add(c1);
		btngroup.add(c2);
		btngroup.add(c3);
		//add(l2);
		add(c1);
		add(c2);
		add(c3);
		setBorder(new PanelBorder("Number of players"));
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
