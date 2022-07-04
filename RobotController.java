package src;

public class RobotController {
	
	
	public static void main(String[] args) {
		Controller ctrl = new Controller();
		
		Button A = new Button("A", true);
		Button B = new Button("B", false);
		Button X = new Button("X", false);
		Button Y = new Button("Y", true);
		
		ctrl.addButton(A);
		ctrl.addButton(B);
		ctrl.addButton(X);
		ctrl.addButton(Y);
		
		System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
		
		ctrl.pressAll();
		System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
		
		ctrl.releaseAll();
		System.out.println("Number of pressed buttons:" + ctrl.getNumOfPressedBtns());
	}

}
