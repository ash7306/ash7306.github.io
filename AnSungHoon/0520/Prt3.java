//정수 2개를 입력 받아서 큰 수에서~ 작은 수로 나눈 몫과 나머지를 출력
import java.util.Scanner;

public class Prt3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int x = scan.nextInt();
		System.out.println("다른 정수를 입력하세요.");
		int y = scan.nextInt();
		System.out.println("---------------------");
		
		// if (x > y) {
			// System.out.println(("나눈 몫은: " + x / y) + ", " + ("나머지는: " + x % y));			
		// } else { 
			// System.out.println(("나눈 몫은: " + y / x)+ ", " + ("나머지는: " + y % x));			
		// }	
		
		int div;
		int mod;
		
		if (x != 0 && y != 0) {
			if (x > y) {
				div = x / y;
				mod = x % y;
			} else {
				div = y / x; 
				mod = y % x;
			}
			//결과 출력하기
				System.out.println(("나눈 몫은: " + div) + ", " + ("나머지는: " + mod));
		}
		System.out.println("0은 입력하면 출력이 안됨");
	}
}	
				

