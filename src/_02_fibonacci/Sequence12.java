package _02_fibonacci;

import javax.swing.JOptionPane;

public class Sequence12 {
public static void main(String[] args){
	int first =0;
	int second = 1;
	int third = 0;
	System.out.println(first);
	System.out.println(second);
	for(int y = 0; y < 12; y++) {
	third = first + second;
	first = second;
	second = third;
		System.out.println(third);

	}
}
}
