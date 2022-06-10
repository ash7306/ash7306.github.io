import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	public static void star (int a, int b, int[] arr) {
		int[] n = new int [10];
		for (int i = 0; i < n.length; i++) {
			if (arr[i] >= a && arr[i] <= b) {
				n[i] = arr[i];  
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			if (n[i] != 0 ) {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int[] arr = new int[10];
		
		System.out.println("1-100 사이 정수를 10개 입력해 주세요");
		for (int i = 0; i < 10; i++) {
			x = scan.nextInt();
			if (x < 1 || x > 100) {
				System.out.println("1-100 사이 정수를 입력해 주세요");
				i--;
			} else {
				arr[i] = x;
			}
		}
		
		System.out.print("1 - 10: "); star(1, 10, arr);
		System.out.print("11 - 20: "); star(11, 20, arr);
		System.out.print("21 - 30: "); star(21, 30, arr);
		System.out.print("31 - 40: "); star(31, 40, arr);
		System.out.print("41 - 50: "); star(41, 50, arr);
		System.out.print("51 - 60: "); star(51, 60, arr);
		System.out.print("61 - 70: "); star(61, 70, arr);
		System.out.print("71 - 80: "); star(71, 80, arr);
		System.out.print("81 - 90: "); star(81, 90, arr);
		System.out.print("91 - 100: "); star(91, 100, arr);		
	}
}
