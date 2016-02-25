import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ObedientTurtoise {
public static void main(String[] args) {
	Tortoise.setSpeed(10);
	Tortoise.show();
	Tortoise.penDown();
	String color=JOptionPane.showInputDialog("What Color Do You Want?: red, green, or blue");
if(color.equals("red")){
	Tortoise.setPenColor(Color.red);
}
else if (color.equals("blue")) {
	Tortoise.setPenColor(Color.blue);
}
else if (color.equals("green")){
	Tortoise.setPenColor(Color.green);
}
else {
	JOptionPane.showMessageDialog(null, "Error");
}
	

String answer=JOptionPane.showInputDialog("What Shape Do You Want?: circle, square, or triangle");
if (answer.equals("circle")) {
drawCircle();
}
else if (answer.equals("triangle")) {
	drawTriangle();

}
else if (answer.equals("square")) {
	drawSquare();
}
else  {
	JOptionPane.showMessageDialog(null, "Error");
}
}

private static void drawCircle() {
	for (int i = 0; i < 360; i++) {
		Tortoise.move(1);
		Tortoise.turn(1);
	}
}

private static void drawTriangle() {
	for (int i = 0; i < 3; i++) {
		Tortoise.turn(360/3);
		Tortoise.move(100);
	}
}

private static void drawSquare() {
	for (int i = 0; i < 4; i++) {
		Tortoise.move(200);
		Tortoise.turn(90);
	}
}

}
