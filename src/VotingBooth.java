import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int old = Integer.parseInt(age);
		if (old < 18) {
			JOptionPane.showMessageDialog(null, "your not old enough to vote");
		} else if (old >= 18) {
			JOptionPane.showInputDialog("who are you voting for");
		}
	}

}
