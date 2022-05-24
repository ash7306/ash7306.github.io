import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {	
		int a = 1;
		int b = 1;
		int c = 0; // 다음항의 합
		for (int i = 1; a <=100; i++) {
									
			System.out.println(a);
			c = a + b; 	
			a = b;
			b = c;
			
			//a b (a+b) b+(a+b) {(a+b)}+{b+(a+b)}  {b+(a+b)}+[{(a+b)}+{b+(a+b)}]
			// 		c    a+c      c    + a + c      a   c       c      a   c
			//		
		}
	}
}