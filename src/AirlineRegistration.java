// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your full name");
	String arrive = JOptionPane.showInputDialog("Where are you going?");
	String birthday = JOptionPane.showInputDialog("When is your birthday?");
	String gender = JOptionPane.showInputDialog("What is your gender?");
	JOptionPane.showMessageDialog(null, "Infromation: "+ name + " Birthday: " + birthday + " Gender: " + gender + " Destination: " + arrive);
}}



