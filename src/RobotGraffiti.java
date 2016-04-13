import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot Haris = new Robot();
	Haris.penDown();
	Haris.setRandomPenColor();
	Haris.setPenWidth(10);
	Haris.setSpeed(10);
	Haris.move(200);
	Haris.turn(180);
	Haris.move(100);
	Haris.turn(90);
	Haris.move(100);
	Haris.turn(90);
	Haris.move(100);
	Haris.turn(180);
	Haris.move(200);
}
}
