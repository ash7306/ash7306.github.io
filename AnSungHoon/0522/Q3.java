//3의배수 Fizz 5의 배수  Buzz

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {	
		int x = 0;
		
		for (int i = 1; i < 36; i++) {
			
			if (i % 3 == 0) {
				System.out.println("Fizz");	
			} else if (i % 5 == 0) {
				System.out.println("Buzz");	
			} else {
				System.out.println(i);	
			}
		}		
	}
}