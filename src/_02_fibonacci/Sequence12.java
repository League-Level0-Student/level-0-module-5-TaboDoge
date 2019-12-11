package _02_fibonacci;

import javax.swing.JOptionPane;

public class Sequence12 {
public static void main(String[] args){
	int i =0;
	int o = 1;
	for(int y = 0; y < 12; y++) {
		i = o + i;
		System.out.println(i + o);
	}
}
}
