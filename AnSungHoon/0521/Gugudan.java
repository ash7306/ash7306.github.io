import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// int b = 1;
		// while (b < 10) {
			// System.out.println("4 * " + b + " = "+ 4 * b);			
			// b++;
		// }

		int b = 1;
		while (b < 10) {
			System.out.printf("%d * %d = %d\n", 4, b, 4 * b);			
			b++;
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하는 구구단의 단수 입력하시오");
		int a = scan.nextInt ();
		
		System.out.println("--------------------");
		int x = 1; 
		while (x <= 9) {
			System.out.printf("%d * %d = %d\n", a, x, a * x);
			x++;
		}
	}
}