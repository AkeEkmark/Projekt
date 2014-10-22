package gui;
import javax.swing.*;

public class Gui {
	public Gui(){
		JFrame f = new JFrame();
		f.setSize(250,50);
		f.setVisible(true);
		f.add(new JToggleButton("difficulty:cakewalk"));
		f.add(new JToggleButton("difficulty:kinda good"));
		f.add(new JToggleButton("difficulty:Mr.Smartypants"));
	}
	
	

}
