package gui.Board;



import control.GameCreator;

/**
 * A class to create the board-gui.
 * @author �ke Ekmark, Andreas Wieselqvist och Simon S�derh�ll.
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
