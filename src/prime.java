import javax.swing.JOptionPane;

public class prime {
public static void main(String[] args) {
	String pick= JOptionPane.showInputDialog("pick a number");
	int numb=0;
	int num=Integer.parseInt(pick);
	for (int i = 2; i < num; i++) {
		if (num%i==0) {
		numb=1;
		
		}
		else {
			
		}
	}
	if (numb==1) {
		JOptionPane.showMessageDialog(null, "it is not prime");
	}
	else {
		JOptionPane.showMessageDialog(null, "it is prime");
	}
}

}
