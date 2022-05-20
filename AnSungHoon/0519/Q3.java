// 4자리 정수중 첫번째와 네번째가 같고 두번째와 세번째 자릿수가 같으면 true 
// ex 4114 true, 4524 false

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("네자리의 정수를 입력하세요.");
		int x = scan.nextInt();
		
		// a 1의 자리수, b는 10, c는 100, d는 1000
		int a = x % 10;
		int b = x % 100 / 10;  
		int c = x % 1000 / 100;
		int d = x / 1000;

 		System.out.println(a == d && b == c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);	
	}
}
