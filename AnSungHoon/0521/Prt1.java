import java.util.Scanner;

public class Prt1 {
	public static void main(String[] args) {		
		// int b = 1;
		// while (b < 10) {
			// System.out.printf("%d * %d = %d\n", 4, b, 4 * b);			
			// b++;
		// }
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하는 반복 만큼 정수를 입력하시오");
		int index = scan.nextInt ();
		
		System.out.println("--------------------");
		int x = 0;
		while (x <= index) {
			System.out.println(x);
			x++;
		}
	}
}