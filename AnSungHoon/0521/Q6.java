// 사용자가 입력한 영단어(latin 문자열)에서 모음(a e i o u)이 몇 개인지 출력하세요.

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("영단어입력");
		String line = scan.nextLine();
				
		int length = line.length();	// 문자열의 길이를 출력하는 것
		int count = 0;
		for (int i = 0; i < length; i++) {
			char c = line.charAt(i); // (i)번째 위치의 문자를 가져오는 함수
			if (c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u') {
				count++;
			}
		}
		System.out.println("모음 개수: " + count);
	}
}