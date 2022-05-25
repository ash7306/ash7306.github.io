// 2 ~ 100 사이의 모든 소수 출력하기
// 2 3 5 11 13
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {		
		
		int count = 0;		
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				if (i % j == 0) {			
					count++;
				}
			} if (count == 1) {
				System.out.println(i + " ");
			} else {
				count = 0;
			}
		} 					
	}
}