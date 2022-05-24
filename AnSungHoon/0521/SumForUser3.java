// 사용자가 몇 개의 정수를 입력할지 먼저 정한 후
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램
// 짝수 홀수로 분류해서 짝수들의 평균, 홀수들의 평균
import java.util.Scanner;

public class SumForUser3 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 몇개?");
		int count = scan.nextInt();
		
		int evensum = 0;	// 짝수합
		int oddsum = 0;		// 홀수합	
		int evencount = 0;	
		int oddcount = 0;
		System.out.println("정수 입력");
		for (int i = 0; i < count; i++) {			
			int num = scan.nextInt();
			if (i % 2 == 0) {		
				// evensum += scan.nextInt();
				evensum += num;
				evencount++;
			} else {
				// oddsum += scan.nextInt();
				oddsum += num;
				oddcount++;
			}
		}			
		System.out.println("--------------");
		System.out.println("짝수 평균은: " + evensum / evencount);
		System.out.println("홀수 평균은: " + oddsum / oddcount);				
	}
}
		