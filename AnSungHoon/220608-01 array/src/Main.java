import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 다음과 같이 정수형 배열이 있을 때
		int[] arr = {5, 15, 32, 222, 119, 534, 36};
		
		// 2자리 수의 개수와 목록을 콘솔창에 출력
		// 개수 : 3
		// -- 목록 --
		// 15
		// 32
		// 36
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (x >=10 && x < 100) {
				count++;
			}
		}
		
		System.out.println(count);
		System.out.println("-- 목록  --");
		
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			if (x >= 10 && x < 100) {
				System.out.println(arr[i]);
			}
		}
	}

}
