package gui.StartUp;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.PanelBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StartPanel extends ColorPanel{
	private JButton startbtn;
	 private StartUpFrame suf;
ImageIcon icon = new ImageIcon ("Cosmetics/startknappsfanskapet.png");

	public StartPanel(StartUpFrame suf) {
		super("Orange");
		this.suf = suf;
		startbtn = new JButton();
		startbtn.setIcon(icon);
		startbtn.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
		setPreferredSize(new Dimension(25, 75));
		setBorder(new PanelBorder(""));
		add(startbtn);
		startbtn.addActionListener(suf);
		setVisible(true);

	}
public JButton getStart() {
	return startbtn;
	
}
		
	}


