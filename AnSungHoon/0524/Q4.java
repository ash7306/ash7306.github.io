// 4. 키(실수 미터단위)와 몸무게(실수 kg)를 전달받아서
// 한국기준 Bmi 지수 구해 반환하는 메소드.
// 몸무게 / 키^2
import java.util.Scanner;

public class Q4 {	
	public static double getBmi(double weight, double height){
		return weight / (height * height);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몸무게(xx.xKg)와 키(x.xxM)를 순서대로 입력하시오.");
		double weight = scan.nextDouble();
		double height = scan.nextDouble();
		
		double bmi = getBmi(weight,height);
		System.out.println(bmi);		
		
	}
}