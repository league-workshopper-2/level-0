import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class TourtoiseSpiral {
public static void main(String[] args) {

String color=JOptionPane.showInputDialog("What Color: Red, Green, or Blue?");
if (color.equalsIgnoreCase("red")) {
	Tortoise.setPenColor(Color.red);
}
if (color.equalsIgnoreCase("blue")) {
	Tortoise.setPenColor(Color.blue);
}
if (color.equalsIgnoreCase("green")) {
	Tortoise.setPenColor(Color.green);
}
String side=JOptionPane.showInputDialog("How Many Sides?");
int turn=Integer.parseInt(side);
for (int i = 1; i < 100; i++) {
		Tortoise.setSpeed(10);
		Tortoise.move(10*i);
		Tortoise.turn(360/turn);
	}
	}
}
