import java.util.Scanner;

public class SumForUser {
	public static void main(String[] args) {
		// 사용자가 정수 범위를 지정 (시작-끝 입력)
		Scanner scan = new Scanner(System.in);
		System.out.println("정수범위 합을 위해 시작 과 끝 입력하시오.");
		int start = scan.nextInt();
		int end = scan.nextInt();

		int sum = 0;
		
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}