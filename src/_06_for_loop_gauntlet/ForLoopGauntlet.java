package _06_for_loop_gauntlet;



//finish challenge 4

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
System.out.println();

//1
for(int q = 0; q < 6; q++) {

	for(int m = 0; m < 3; m++) {
	
		
		
		if(q<1 & m < 3) {
			
			System.out.print(0);
			System.out.println(m);
			 
			
		}
		if(q> 1 & q <= 2) {
			System.out.print(1);
			System.out.println(m);
		}
		 if (q ==3) {
			System.out.print(2);
			System.out.println(m);
				 
		 }
		
		
			
	
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
//4

for(int p = 1; p != 6; p++) {
for(int j = 0; j < p; j++) {
	System.out.println("*");
}
}




for(int d =0; d != 101; d++) {
	System.out.println(100-d);
}

}
}
