package _06_for_loop_gauntlet;

public class ForLoopGauntlet {
public static void main(String[] args) {
for(int i = 0; i < 101; i++) {
	System.out.println(i);
}
for(int y =100; y > -1; y--) {
	System.out.println(y);
}
for(int x = 2; x < 10 ; x++, x++) {
	System.out.println(x);
}
for(int a = 0; a < 501; a++) {
	if(a%2==0) {
		System.out.println(a + " is a even number");
	}
	else {
		System.out.println(a + " is a odd number");
	}
}
for(int b = 0; b < 778; b++) {
	if(b%7==0) {
		System.out.println(b);
	}
}
int age = 0;
for(int t = 2006; t < 2020; t++, age++) {
	System.out.println(t + "   I am "+age+" years old.");
}
int n = 0;
for(int c = 0; c < 9; c++) {
	if(c%3 ==0) {
		n++;
	}
	System.out.println(n);
	for(int u =0; u < 9; u++) {
		if(u%3 ==0) {
			n++;
			System.out.println(n);
	}
	
}
}
}
}
