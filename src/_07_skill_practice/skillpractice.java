package _07_skill_practice;

import javax.swing.JOptionPane;

public class skillpractice {

public static void main(String[] args) {
String dime = JOptionPane.showInputDialog("How many dimes do you have?");
int Dime = Integer.parseInt(dime);
Dime = Dime * 10;
JOptionPane.showMessageDialog(null, "You have "+Dime+" cents or "+Dime/100+" dollars");
String Height = JOptionPane.showInputDialog("How tall are you (in)");
int height = Integer.parseInt(Height);
if (height < 36) {
	JOptionPane.showMessageDialog(null, "Stop being VERY short");
}
	for(int i = 0; i < 30; i++) {
		if(i%3==0) {
			System.out.println(i);
		}
	}
String city = JOptionPane.showInputDialog("What city do you live in?");
if(city.equals("Tokyo")) {
	JOptionPane.showMessageDialog(null, "Japan's Finest City");
}
if(city.equals("San Deigo")) {
	JOptionPane.showMessageDialog(null, "America's Finest City");
}
if(city.equals("Singapore")){
	JOptionPane.showMessageDialog(null, "The Worlds's Finest City");
}
String Cars = JOptionPane.showInputDialog("How many cars do you have?");
int cars = Integer.parseInt(Cars);
if(cars == 0) {
	JOptionPane.showMessageDialog(null, "You should buy a Honda Civic Si");
}
if(cars == 1) {
	JOptionPane.showMessageDialog(null, "Is it a white Honda Prelude 4th gen");
	
}
String school = JOptionPane.showInputDialog("What's the name of your school?");
JOptionPane.showMessageDialog(null, school + " is a good school.");

}
}
