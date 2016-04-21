
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int is = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		System.out.println(is);

		if (is == 1) {
			System.out.println("sleep in");
		}
		
		if (is == 0) {
			int it = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "", JOptionPane.YES_NO_OPTION);
			System.out.println(it);
			System.out.println("Get Up Lazybones!");
		
		if (is==0 it==0) {
			System.out.println("sleep in");
		}
		}
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}
