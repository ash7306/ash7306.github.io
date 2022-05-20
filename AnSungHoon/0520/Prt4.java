// 3개의 정수를 입력받아서 가장 큰 수를 출력하세요.

import java.util.Scanner;

public class Prt4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 3개 입력하시오");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if (x > y && x > z) {
			if (y > z) {
				System.out.printf("%d %d %d ", x, y, z);
			} else {
				System.out.printf("%d %d %d ", x, z, y);			
			} 
		}
		
		if (y > x && y > z) {
			if (x > z) {
				System.out.printf("%d %d %d ", y, x, z);
			} else {
				System.out.printf("%d %d %d ", y, x, z);			
			} 
		}
		
		if (z > x && z > y) {
			if (x > y) {
				System.out.printf("%d %d %d ", z, x, y);
			} else {
				System.out.printf("%d %d %d ", z, y, x);			
			} 		
		}	
	}
}