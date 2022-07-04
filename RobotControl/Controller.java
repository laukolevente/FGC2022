package src;

import java.util.ArrayList;

public class Controller{
	private ArrayList<Button> buttons;
	
	public Controller() {
		buttons = new ArrayList<>();
	}
	
	public void addButton(Button b) {
		buttons.add(b);
	}
	
	public void pressAll() {
		for(Button b : buttons) {
			b.setState(true);
		}
	}
	
	public void releaseAll() {
		for(Button b : buttons) {
			b.setState(false);
		}
	}
	
	public int getNumOfPressedBtns() {
		int cnt = 0;
		for (Button b : buttons) {
			if(b.getState())
				cnt++;
		}
		return cnt;
	}
}
