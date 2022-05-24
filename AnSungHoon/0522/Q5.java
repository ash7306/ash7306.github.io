// 사용자가 입력한 정수가 소수임을 확인하여 출력

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("정수를 입력");		
		int num = scan.nextInt();
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		} if (count == 2) {
			System.out.println("소수요~");	
		} else {
			System.out.println("소수아님요~");	
		}		
	}
}