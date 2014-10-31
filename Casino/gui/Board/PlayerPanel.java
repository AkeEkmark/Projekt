package gui.Board;

import gui.Cosmetics.Green;
import gui.Cosmetics.PanelBorder;
import gui.Cosmetics.ColorPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.Card;

public class PlayerPanel extends ColorPanel implements MouseListener{
	private ProgressPanel progressPanel;
	private ArrayList<FrontCardPanel> cardPanels;
	private FrontCardPanel cardPanel;
	
	public PlayerPanel() {
		super("Green");
		//setLayout(new BorderLayout());
		cardPanels = new ArrayList<FrontCardPanel>();
		progressPanel = new ProgressPanel();
		setPreferredSize(new Dimension(200, 150));
		addMouseListener(this);
		setBorder(new PanelBorder(""));
		add(progressPanel);
		setVisible(true);
	}
	public void addCard(Card card){
		cardPanel = new FrontCardPanel(card);
		cardPanels.add(cardPanel);
		add(cardPanel);
		
}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		for (FrontCardPanel cardPanel : cardPanels) {
			if (e.getComponent() == cardPanel) {
				if (!cardPanel.getCard().isSelected()) {
					cardPanel.setOrange();
					
				}
				else {
					cardPanel.setGreen();
				}
			}
			else {
				if (cardPanel.getCard().isSelected()){
					cardPanel.setGreen();
				}
			}
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
