// 사용자가 정수를 입력받아
// 짝수면 "짝수입니다.", 홀수면 "홀수입니다." 출력하기

import java.util.Scanner;

public class Prt1 {
	public static void main(String[] args) {
		/*
		if (조건식) {	// 조건식에 참이 오면 than절의 문장이 수행됨
			// 문장 1
			// 문장 2
			// if가 거짓이면 else 절로 건너뜀
		} else {	// 
			// 문장 3
			// 문장 4
		}
		// 문장 5	
		*/
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int x = scan.nextInt();			 		
		
		if (0 == x % 2) {
			System.out.println("짝수입니다.");		
		} else {
			System.out.println("홀수입니다.");
		}
		System.out.println("프로그램종료");
	}
}