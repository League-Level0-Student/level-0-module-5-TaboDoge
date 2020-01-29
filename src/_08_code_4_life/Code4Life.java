package _08_code_4_life;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life {
public static void main(String[] args) {
	

	// 1. Ask the user how many hours they spent coding this week.
String Hours = JOptionPane.showInputDialog("how many hours did you spend coding this week?"); 
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.
int hours = Integer.parseInt(Hours);
if(hours<=2) {
	JOptionPane.showMessageDialog(null, "same");
}
	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	if(hours>=3 ^ hours>=5) {
		JOptionPane.showMessageDialog(null, "OK");
	}

	// 4. If it is more than 5, call the method below to play the Batman theme song.
if(hours>=5) {
	JOptionPane.showMessageDialog(null, "Wow");
}
	
}
}
