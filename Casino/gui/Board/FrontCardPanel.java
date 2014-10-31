package gui.Board;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.Green;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Card;

public class FrontCardPanel extends ColorPanel {
	private Card card;
	private BufferedImage icon;
	private JLabel l;
	
	
	public FrontCardPanel(Card card) {
		super ("Green");
		
		
		this.card = card;
		setPreferredSize(new Dimension(84, 130));
		try{
	    	icon = ImageIO.read(new File(card.getFileName()));
	    }catch (IOException e){
	    	System.out.println("Error");
	    }
	    l = new JLabel(new ImageIcon(icon));
		add(l);
		setVisible(true);
		
	}
	public void setOrange() {
		setBackground(Color.ORANGE);
		card.setSelected();
	}
	public void setGreen() {
		setBackground(new Green());
		card.setNotSelected();
	}
	public Card getCard() {
		return card;
	}
	
	
}
