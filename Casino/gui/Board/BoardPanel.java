package gui.Board;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.Green;
import gui.Cosmetics.PanelBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import control.GameCreator;
import control.GameHandler;
import model.Card;

public class BoardPanel extends ColorPanel implements MouseListener {
	private ScoreboardPanel sbp;
	private JPanel emptyslot;
	private ArrayList<FrontCardPanel> frontPanels;
	private InputMap inputMap;
	private ActionMap actionMap;
	private GameCreator gameCreator;
	public BoardPanel(GameCreator gameCreator) { // mittenruta gr�n
		super("Green");
		// sbp = new ScoreboardPanel();
		this.gameCreator = gameCreator;
		frontPanels = new ArrayList<FrontCardPanel>();
		setPreferredSize(new Dimension(600, 400));
		inputMap = getInputMap();
		actionMap = getActionMap();
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "Space");
		actionMap.put("Space", new SpaceAction());
//		emptyslot = new ColorPanel("Green");
//		emptyslot.setPreferredSize(new Dimension(84, 130));
//		emptyslot.setBorder(new PanelBorder("Throw Card"));
//		add(emptyslot);
		// add(sbp);
		setVisible(true);
	}

	public void addCard(Card card) {
		FrontCardPanel front = new FrontCardPanel(card, this);
		add(front);
		frontPanels.add(front);
	}

	public void removeCard(Card card) {
		for (FrontCardPanel front : frontPanels) {
			if (front.getCard() == card);
				remove(front);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		for (FrontCardPanel cardPanel : frontPanels) {
			if (e.getComponent() == cardPanel) {
				if (!cardPanel.getCard().isSelected()) {
					cardPanel.setBlue();
					
				}
				else {
					cardPanel.setGreen();
				}
			}
//			else {
//				if (cardPanel.getCard().isSelected()){
//					cardPanel.setGreen();
//				}
//			}
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
	public class SpaceAction extends AbstractAction {
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
			gameCreator.endPlayerTurn();
			
		}
		
	}

}

