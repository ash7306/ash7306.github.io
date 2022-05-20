//정수를 세개 입력해서 연속된  정수 일시 true를 출력

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3개의 정수를 입력하세요");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();				
					
		System.out.println(x == --y && ++y == --z);
		//System.out.println(x == --y && ++y == --z && ++x == y);
		// 					(1 ==  1  &&  2  ==  2  &&  2  == 2) 	
	}
}