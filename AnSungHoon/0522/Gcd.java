import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		int x, y, r;
		System.out.println("두 개의 정수를 입력하시오(큰 수),(작은 수): ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
	
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.printf("최대 공약수는 %d입니다.\n", x);
	}
}