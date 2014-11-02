package gui.Board;



import control.GameCreator;

/**
 * A class to create the board-gui.
 * @author Åke Ekmark, Andreas Wieselqvist och Simon Söderhäll.
 *
 */
public class Gui implements Runnable{
	private BoardFrame boardframe;
	public Gui(GameCreator gameCreator){
		boardframe = new BoardFrame(gameCreator);
		 
	}
	public BoardFrame getBoardFrame() {
		return boardframe;
	}
	@Override
	public void run() {
		
		
	}
	
	

}
