package gui;

import guicosmetics.OrangePanel;
import guicosmetics.PanelBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StartPanel extends OrangePanel {
	private JButton startbtn;
	 
ImageIcon icon = new ImageIcon ("Cosmetics/startknappsfanskapet.png");

	public StartPanel() {
		startbtn = new JButton();
		startbtn.setIcon(icon);
		startbtn.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
		setPreferredSize(new Dimension(25, 75));
		setBorder(new PanelBorder(""));
		add(startbtn);
		setVisible(true);

	}

}
