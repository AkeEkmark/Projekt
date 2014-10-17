package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import model.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class modelTest {
	Player player1;
	Player player2;
	Board board;
	Deck deck;
	@Before
	public void setUp() throws Exception {
		board = new Board();
		player1 = new HumanPlayer("Åke", 1);
		player2 = new ComputerPlayer("Deep blue", 2, 1);
		deck = new Deck();
		player1.setBoard(board);
		player2.setBoard(board);
		player1.dealCardToHand(deck.getCard(3));
		player2.dealCardToHand(deck.getCard(14));
		board.addCardToBoard(deck.getCard(0));
		board.addCardToBoard(deck.getCard(17));
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ArrayList<Card> cardstotake = new ArrayList<Card>();
		cardstotake.add(board.getCardsOnBoard().get(1));
		player1.takeCardFromBoard(player1.getCardsOnHand().get(0), cardstotake);
		assertEquals(player1.getCardsInPile().get(0), deck.getCard(3));
	}

}
