// 정수 2개와 연산자(+ - * / ) 등을 입력받아 사칙연산을 수행하는 계산기 프로그램

import java.util.Scanner;

public class Prt6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int x = scan.nextInt();
		scan.nextLine(); //int 사용하면 그 정수뒤에 \n이 남아잇음 scan.nextLine();
		System.out.println("연산자(+ - * /)중 하나를 입력하세요.");
		String oper = scan.nextLine();
		System.out.println("정수를 입력하세요");
		int y = scan.nextInt();
		int mod;
		
		if (oper.equals("+")||oper.equals("-")||oper.equals("*")||oper.equals("/")) {
			if (oper.equals("+")) {
				mod = x + y;
			} else if (oper.equals("-")) {
				mod = x - y;
			} else if (oper.equals("*")) {
				mod = x * y;
			} else if (oper.equals("/")) {
				mod = x / y;
			} else {
				
			}
			System.out.println(mod);	
		}
	}	
}