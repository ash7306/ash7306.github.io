// 사용자가 입력한 5개의 정수의 합 구하기
import java.util.Scanner;

public class SumForUser2 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하시오.");
		
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int num = scan.nextInt();
			// 연산
			sum += num;
			// 사용자 입력으로 전달받은 변수값을 sum에 집어넣음
		}		
		System.out.println(sum);
	}	
}