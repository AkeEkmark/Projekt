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

public class FrontCardPanel extends ColorPanel implements MouseListener {
	private Card card;
	private BufferedImage icon;
	private JLabel l;
	private PlayerPanel playerpanel;
	public FrontCardPanel(Card card, PlayerPanel playerPanel) {
		super ("Green");
		this.playerpanel = playerPanel;
		addMouseListener(this);
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
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(getBackground()!= Color.ORANGE){
		setBackground(Color.ORANGE);
	} else { 
		setBackground(new Green());
	}
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
