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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import control.GameCreator;
import control.GameHandler;
import control.GameHandler.MonitorObject;
import model.Card;
import model.ComputerPlayer;
import model.HumanPlayer;
import model.Player;

public class BoardPanel extends ColorPanel implements MouseListener {
	private ScoreboardPanel sbp;
	private JPanel emptyslot;
	private ArrayList<FrontCardPanel> frontPanels;
	private InputMap inputMap;
	private ActionMap actionMap;
	private GameCreator gameCreator;
	private BoardFrame boardFrame;

	public BoardPanel(GameCreator gameCreator, BoardFrame boardFrame) { // mittenruta gr�n
		super("Green");
		
		this.gameCreator = gameCreator;
		this.boardFrame = boardFrame;
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

		setVisible(true);
	}
	public void addScoreBoard() {
		sbp = new ScoreboardPanel();
		for (Player player : gameCreator.getPlayerHandler().getPlayers()) {
			sbp.createLabel(player.getName(), player.getPosition());
		}
		
		boardFrame.getPlayer2().add(sbp);
		gameCreator.getPointCounter().setScoreBoard(sbp);
		
	}
	public void addCard(Card card) {
		FrontCardPanel front = new FrontCardPanel(card, this);
		add(front);
		frontPanels.add(front);
	}

	public void removeCard(Card card) {
		ArrayList<FrontCardPanel> cardPanelsToRemove = new ArrayList<FrontCardPanel>();
		
		for (FrontCardPanel front : frontPanels) {
			if (front.getCard() == card){
				cardPanelsToRemove.add(front);
			}
				
		}
		for (FrontCardPanel front : cardPanelsToRemove) {
			frontPanels.remove(front);
			remove(front);
		}
		
		
	}

	public ArrayList<FrontCardPanel> getCardPanels() {
		return frontPanels;
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
			Player player = gameCreator.getPlayerHandler().getPlayers().get(0);
			ArrayList<String> moves = new ArrayList<String>();
			if (!gameCreator.endPlayerTurn(player)) {
				JOptionPane.showMessageDialog(null, "That move is not possible");
			}
			else {
				ArrayList<FrontCardPanel> cardsToRemoveBoard = new ArrayList<FrontCardPanel>();
				for (FrontCardPanel cardPanel : frontPanels) {
					if (cardPanel.getCard().isSelected()) {
						cardsToRemoveBoard.add(cardPanel);		
					}
				}
				for (FrontCardPanel cardPanel : cardsToRemoveBoard) {
					removeCard(cardPanel.getCard());
				}
				
				ArrayList<FrontCardPanel> cardsToRemovePlayer = new ArrayList<FrontCardPanel>();
				for (FrontCardPanel cardPanel : boardFrame.getPlayer1().getCardPanels()) {
					if (cardPanel.getCard().isSelected()) {
						if (cardPanel.getCard().isSelected()) {
							cardsToRemovePlayer.add(cardPanel);		
						}
					}
				}
				if (cardsToRemoveBoard.isEmpty()) {
					for (FrontCardPanel cardPanel : cardsToRemovePlayer) {
						cardPanel.getCard().setNotSelected();
						addCard(cardPanel.getCard());
						
					}
					revalidate();
				}
				for (FrontCardPanel cardPanel : cardsToRemovePlayer) {
					boardFrame.getPlayer1().removeCard(cardPanel.getCard());
					
				}
				repaint();
				boardFrame.getPlayer1().repaint();
				player.setTurnEnded(true);
				if (player.getCardsOnHand().size() == 0) {
					gameCreator.newHand();
					moves = computerturns();
					for (String string : moves) {
						System.out.println(string);
					}
				}
				else {
					moves = computerturns();
					for (String string : moves) {
						System.out.println(string);
					}
				}
				
				
				
			}
			
		}
		
	}
	public ArrayList<String> computerturns() {
		ArrayList<String> moves = new ArrayList<String>();
		for (Player player : gameCreator.getPlayerHandler().getPlayers()) {
			
			if (player instanceof HumanPlayer) {	
			}
			else if (player instanceof ComputerPlayer) {
				String move = gameCreator.getAiControl().makeMove(player);
				moves.add(move);
			}
		}
		return moves;
		
	}

}

