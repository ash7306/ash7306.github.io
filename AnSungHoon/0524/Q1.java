// 1. 원의 반지름을 실수형으로 전달받아 원넓이(실수형)를 반환하는
// 메소드 작성 후 메인 메소드에서 호출한 값을 출력해 확인해보기
import java.util.Scanner;

public class Q1 {
	// π(파이)*r(반지름)^2 = 원넓이
	public static double circleArea(double r) {
		return 3.14 * r * r ;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("반지름을 입력하시오.");
		double r = scan.nextDouble();
		double result = circleArea(r);
		System.out.println(result);
	}
}