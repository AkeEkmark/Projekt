package gui.Board;



import control.GameCreator;


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
