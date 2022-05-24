// 자판기 프로그램
// 돈입력
// 반복하여 입력 받아
// 1번 콜라 : 1500 / 2번 사이다 : 1300 / 3번 계산
// 총 몇개의 캔을 구입하고, 거스름돈은 얼마인지 출력하세요 (외상 ㄴㄴ)

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("돈 투입");
		int money = scan.nextInt();
		
		int num = 0;
		int cokeCount = 0;
		int sidarCount = 0;
		while (money > 0) {
			System.out.println("1:콜라,2:사이다,3번:계산 입력");
			num = scan.nextInt();
			
			if (num == 1) {
				if (money >= 1500) {
					money -= 1500;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} if else (num == 2) {
				if (money >= 1300) {
					money -= 1300;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} else {
				System.out.println(계산하겟음);	
			}
		System.out.println(money);
	}		
}