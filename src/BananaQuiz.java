// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String bananas=JOptionPane.showInputDialog("do you like bananas");
		//2. if they say no, 
				if(bananas.equals("no")){
			//tell them they are crazy 
					JOptionPane.showMessageDialog(null, "you are crazy");
			//and end quiz
				}
		//3. if they say yes
				else if(bananas.equals("yes")){
		//	ask them what is their favorite hobby
		String hobby=JOptionPane.showInputDialog("what is your favorite hobby");
		//	show a pop up that says "<your hobby> is much better with bananas!"
		JOptionPane.showMessageDialog(null, hobby+" is better with bananas");		
				}
	}

}
