import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("what is your height?");
		int length = Integer.parseInt(height);
		if (length <= 4) {
			JOptionPane.showMessageDialog(null, "Sorry You Can't Ride ):");
		} else {
			JOptionPane.showMessageDialog(null, "Enjoy The Ride!");
		}
	}
}
