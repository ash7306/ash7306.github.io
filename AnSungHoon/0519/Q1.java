// 사용자가 입력한 정수가 0이상이며 7의 배수일때 true 출력

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int x = scan.nextInt();
	
		System.out.println(0 <= x && 0 == x % 7);
	}
}