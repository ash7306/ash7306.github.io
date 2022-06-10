// 사용자에게 5번의 정수를 입력받아
// 최근 입력한 순(역순)으로 출력하기

// 예) 10 20 30 40 50 -> 50 40 30 20 10

// 사용자가 0이하의 정수를 입력할때까지 반복하여 입력
// 최근 5개를 출력

// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60
import java.util.Scanner;
public class Main5 {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 5번 입력");
		
		int[] scores = new int[5];
		for (int i = 0 ; i < scores.length ; i++) {
			System.out.print("정수를 입력하시오.");;
			scores[i] = scan.nextInt();
		}
		
		for (int j = scores.length - 1; j >= 0; j--) {
			System.out.print(scores[j]);		
		}
	}
}
