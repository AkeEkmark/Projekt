package gui.Board;



import control.GameCreator;


public class Gui {
	private BoardFrame boardframe;
	public Gui(GameCreator gameCreator){
		boardframe = new BoardFrame(gameCreator);
		
		
		 
	}
	public BoardFrame getBoardFrame() {
		return boardframe;
	}
	
	

}
