//사용자에게 정수 하나를 입력 받아서
//제곱 값을 출력하는 프로그램

import java.util.Scanner; 
//*****Scanner사용을 위한 import 꼭 넣기!!!

public class Squared {
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
								
		System.out.println("제곱 값 구하기"); 
		
		System.out.print("정수 하나를 입력하시오: "); 
		int x = scanner.nextInt();
		int squared = (x * x);
				
		System.out.println("제곱 값: " + squared);
		
	}
}		