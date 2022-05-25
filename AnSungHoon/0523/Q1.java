// 주민번호를 입력하면
// 성별을 출력하는 프로그램
// 예) xxxxxx-1xxxxxx 

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하시오(사이에 '-' 사용)");
		String num = scan.nextLine();
		
		char c = num.charAt(7);
		int a = Character.getNumericValue(c);
		if (num.length() == 14) {
			switch (a) {
			case 1:
			case 3:
				System.out.println("남자");
				break;
			case 2:
			case 4:
				System.out.println("여자");
				break;
			default:
				System.out.println("다시 입력하세요");
			}			
		} else {
			System.out.println("잘못입력");
		}						
	}
}