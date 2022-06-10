import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("좌석을 예약하시겠습니까?(1 또는 0)");
		int x = scan.nextInt();
		int[] ex = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] seat = new int [10];
//		for(int i = 0; i < 10; i++)
					
		while (x == 1) {
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
			System.out.println("------------------");
			System.out.println(Arrays.toString(ex));
			System.out.println("------------------");
			System.out.println(Arrays.toString(seat));
			System.out.print("몇번째 좌석을 예약하시겠습니까?");
			int number = scan.nextInt();
			seat[number-1] = 1; 
			System.out.print("예약되었습니다.");
			System.out.print("좌석을 예약 하시겠습니까?(1또는0)");
			int y = scan.nextInt();
			
			if (y == seat[number-1]) {
				System.out.print("이미 예약된 좌석 입니다.");
				continue;
			} else { 
				if (y != 1) {
					break;
				} else {
					continue;
				}
			}				
		} 
		System.out.println("프로그램을 종료");
		}
	}


