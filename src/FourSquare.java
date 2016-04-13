import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Haris = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
Haris.setSpeed(1000000);
		// 5. Set the pen width to 5
Haris.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i < 4; i++) {
	

			// 7. Set the pen color to random
	Haris.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
Haris.turn(90);
}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() { 
		for (int i = 0; i < 4; i++) {
		Haris.penDown();
		Haris.move(50);
		Haris.turn(90);
	}
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		
		
	}

	public static void main(String[] args) { 
		new FourSquare().go();
	}

}


