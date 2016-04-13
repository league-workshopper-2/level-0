import javax.swing.JOptionPane;

public class Everythingisawesome {
public static void main(String[] args) {
	for (int i = 0; i < 100; i++) {
		
	
	String what = JOptionPane.showInputDialog("What do you like?");
	JOptionPane.showMessageDialog(null, what + " is awesome.");
	}
}
}
