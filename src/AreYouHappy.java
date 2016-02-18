import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String dot;
		String happy = JOptionPane.showInputDialog("Are You Happy?");
		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing!");
		}
		if (happy.equalsIgnoreCase("no")) {
			dot = JOptionPane.showInputDialog("Do You Want To Be Happy?");
			if (dot.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");
			}
			if (dot.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing");
			}
		}
	}

}
