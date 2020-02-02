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
for(int t = 2006; t < 2021; t++, age++) {
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
//1
for(int b = 0; b < 10; b++, b++, b++) {
	if (b >= 0 & b < 4) {
	System.out.println(0);
	}
	else if (b > 3 & b < 7) {
	System.out.print(0);
	System.out.println(1);
	System.out.print(1);
	System.out.println(1);
	System.out.print(2);
	System.out.println(1);
	
	}
	else {
		System.out.println("2");
		System.out.println("2");
		System.out.println("2");
	}
}
//2
for(int r = 1; r < 10; r++) {
System.out.print(r+" ");
if(r%3==0) {
	System.out.println();
}
}
//3
for(int u = 0; u < 101; u++) {
	if(u < 10) {
		System.out.print(u + "  ");
	}
	else {
	System.out.print(u + " ");
	}
	if(u%10==0) {
		System.out.println();
	}
}
}
}
