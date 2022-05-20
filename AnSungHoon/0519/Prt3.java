// 사용자가 입력한 정수가 짝수면 true 홀수면 false
import java.util.Scanner;

public class Prt3 {	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		int x = scan.nextInt();
		
		System.out.println("짝수면 true, 홀수면 false");		
		System.out.print(0 == x % 2);	
		
		
	}
}



