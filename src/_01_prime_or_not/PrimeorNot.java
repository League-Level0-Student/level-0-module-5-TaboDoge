package _01_prime_or_not;
import javax.swing.JOptionPane;

public class PrimeorNot {
public static void main(String[] args) {
	String n = JOptionPane.showInputDialog("Choose a number");
	int N = Integer.parseInt(n);
	int u =0;
	for(int i = 2; i < N; i++) {
		if(N%i==0) {
			u = u +1;
		}
		System.out.println(u);
		
	} if(u == 0) {
		JOptionPane.showMessageDialog(null, "This is a prime number");
	}
	else {
		JOptionPane.showMessageDialog(null, "This is not a prime number");

	}
}
}
