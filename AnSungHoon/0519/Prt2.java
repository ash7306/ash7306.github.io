// 사용자가 입력한 두 정수의 합이 0이면 true를 출력하고
// 그렇지 않은 경우 false를 출력해보세요.

import java.util.Scanner;

public class Prt2 {	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력 하세요");
		int x = scan.nextInt();
		System.out.print("두번째 정수를 입력 하세요");
		int y = scan.nextInt();
		
		System.out.println("두 정수의 합은: " + (x + y));
		System.out.println("두 정수의 합이 0과 같나요: " + ((x + y) == 0));
		
		
	}
}	