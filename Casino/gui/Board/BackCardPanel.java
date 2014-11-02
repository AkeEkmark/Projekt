package gui.Board;

import gui.Cosmetics.ColorPanel;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 * A panel to display the backside of a card.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class BackCardPanel extends ColorPanel {
	private String position;
	private BufferedImage icon;
	private BufferedImage iconR;
    private JLabel back;
    private JLabel backR;
	public BackCardPanel(String position ) {
		super ("Green");
	    try{
	    	icon = ImageIO.read(new File("Cards/back.png"));
	    }catch (IOException e){
	    	System.out.println("Error");
	    }
	    back = new JLabel(new ImageIcon(icon));
	    try{
	    	 iconR = ImageIO.read(new File("Cards/backR.png"));
	    }catch (IOException e){
	    	System.out.println("Error");
	    }
	    backR = new JLabel(new ImageIcon(iconR));
		this.position = position;
		if (position == "NORTH"){
			setPreferredSize(new Dimension(84, 130));
		add(back);
		}else {
			setPreferredSize(new Dimension(130, 84));
		add(backR);
		}
		setVisible(true);
	}
}
