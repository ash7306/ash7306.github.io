// 사용자가 0이하의 정수를 입력할때까지 반복하여 입력
// 최근 5개를 출력

// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60

import java.util.Scanner;

public class Main6 {
		
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력, 끝낼땐 0 또는 음수 입력");
		
		int[] arr = new int[5];
		int i = 0;
		
		while(true) {
			int n = scan.nextInt();
			if(n <= 0) {
				break;
			}
			
			arr[i] = n;
			i++;
			
			if(i == 5) {
				i = 0;
			}			
		}
		
		for(i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
//		int count = 0;
//		int scores[] = new int[count];
//		
//		while(true) {
//			System.out.print("입력");;
//			int x = scan.nextInt();
//			if (x > 0) {
//				for (int i = 0; i < scores.length; i++) {
//				System.out.print("정수 입력하시오.");		
//				}
//			} else {
//				System.out.print("종료");;
//				break;
//			}				
//		}		
	}
}