// 2의 제곱 수를 32개 나열하고 결과값 확인 2 4 8 16 32 ...

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		long num = 1; // 제곱값
		int count = 0;
		for (int i = 1; i < 33; i++) {
			num *= 2;
			count++;
			System.out.println(num);
		}
		System.out.println(count);
	}
}