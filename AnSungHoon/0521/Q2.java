// 사용자의 입력 n, m에 대해
// n^m(n의 m제곱)을 출력하기

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 n m 입력");
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		long x = 1;	// 제곱값
		for (int i = 0; i < m; i++) {		
			x *= n;
		}
		System.out.println(x);
	}
}