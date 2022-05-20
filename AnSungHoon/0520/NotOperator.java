import java.util.Scanner;

public class NotOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean t = true;
		// not 연산자 true는 false로 false는 true로
		
		t = !t;
		System.out.println(t);
		System.out.println(!t);
		System.out.println(!!t);
		System.out.println(!!!t);
		
		!((10 > 3) && (3 == 3));	//false
		!(!(10 > 3) || (3 == 3));	//false		
	}
}