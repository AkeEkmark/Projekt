package gui.Board;

import gui.Cosmetics.ColorPanel;
import gui.Cosmetics.PanelBorder;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import model.Card;
import model.Player;
/**
 * A panel to display the players cards.
 * Listener to "select" cards.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class PlayerPanel extends ColorPanel implements MouseListener, Players{
	private ProgressPanel progressPanel;
	private ArrayList<FrontCardPanel> cardPanels;
	private FrontCardPanel cardPanel;
	private Player player;
	public PlayerPanel(Player player) {
		super("Green");
		//setLayout(new BorderLayout());
		this.player = player;
		cardPanels = new ArrayList<FrontCardPanel>();
		//progressPanel = new ProgressPanel();
		setPreferredSize(new Dimension(200, 150));
		addMouseListener(this);
		setBorder(new PanelBorder(""));
		//add(progressPanel);
		setVisible(true);
	}
	public void addCard(Card card){
		cardPanel = new FrontCardPanel(card, this);
		cardPanels.add(cardPanel);
		add(cardPanel);
		
	}
	@Override
	public void removeCard(Card card) {
		ArrayList<FrontCardPanel> cardPanelsToRemove = new ArrayList<FrontCardPanel>();
		
		for (FrontCardPanel front : cardPanels) {
			if (front.getCard() == card){
				cardPanelsToRemove.add(front);
			}		
		}
		for (FrontCardPanel front : cardPanelsToRemove) {
			cardPanels.remove(front);
			remove(front);
		}
		
		
	}
	public Player getPlayer() {
		return player;
	}
	public ArrayList<FrontCardPanel> getCardPanels() {
		return cardPanels;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		for (FrontCardPanel cardPanel : cardPanels) {
			if (e.getComponent() == cardPanel) {
				if (!cardPanel.getCard().isSelected()) {
					cardPanel.setBlue();
					
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
