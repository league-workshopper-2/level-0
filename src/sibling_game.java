import javax.swing.JOptionPane;

public class sibling_game {
public static void main(String[] args) {
	
	String siblings=JOptionPane.showInputDialog("do you have any siblings");
	if (siblings.equals("no")) {
		JOptionPane.showMessageDialog(null, "haha");
		System.exit(0);
	}
String many=JOptionPane.showInputDialog("how many(write a number)");
		int num=Integer.parseInt(many);
		if (num<=2) {
			JOptionPane.showMessageDialog(null, "that is a small family");
		}
		else {
			JOptionPane.showMessageDialog(null, "you have a big family");
		}
String position=JOptionPane.showInputDialog("are you the oldest, middle, or youngest in your family");	
if (position.equals("oldest")) {
	JOptionPane.showMessageDialog(null, "lucky");

}
else if (position.equals("middle")) {
	JOptionPane.showMessageDialog(null, "better than being the youngest");
}
else {
	JOptionPane.showMessageDialog(null, "that sucks");
}
}
}
