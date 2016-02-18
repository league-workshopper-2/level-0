import javax.swing.JOptionPane;

public class bieberkaraoke {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 3; j++) {
				JOptionPane.showMessageDialog(null, "baby");
			}
			if (i % 2 == 1) {
				JOptionPane.showMessageDialog(null, "no");

			} else {
				JOptionPane.showMessageDialog(null, "oh");
			}
		}
		JOptionPane.showMessageDialog(null, "Thought You'd Always Be Mine");
	}
}