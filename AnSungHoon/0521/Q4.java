// 사용자가 입력한 정수의 약수를 나열하고 총 개수를 출력하세요.
// 약수 : 나누어 떨어지는 수
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("정수를 입력");		
		int num = scan.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("약수 개수: " + count);
		
	// int cokeCount = 0;
		// int ciderCount = 0;
		// boolean con = true;
		
		// System.out.print("돈을 투입해주세요.");
		// int money = scan.nextInt();
		
		///////////////////////////////////////////////////////////
		
		// while(con){
			// System.out.print(" 1번 콜라: 1500 2번 사이다: 1300 3번 계산:");
			// int number = scan.nextInt();
			
			// if(number == 1){
				// if( money >= 1500){
					// money -= 1500;
					// cokeCount++;
					
				// } else{
					// System.out.println("잔액이 부족합니다.");
				// }			
			// } else if(number == 2){
				// if(money >= 1300){
					// money -= 1300;
					// ciderCount++;
				// } else{
					// System.out.println("잔액이 부족합니다.");
				// }				
			// } else if(number == 3){
				// con = !con;
			// } else{
				// System.out.println("잘못된 입력입니다.");
			// }
			
		// }
		// System.out.printf("구입한 캔의 개수는 콜라%d개 사이다%d개 이고 거스름돈은%d원 입니다.", cokeCount, ciderCount, money);
	
		////////////////////////////////////////////////////////////
		
			// Scanner sc = new Scanner(System.in);
		// System.out.print("돈 입력: ");
		// int money = sc.nextInt();
		// int coke = 0;
		// int soda = 0;
		
		// while (money > 0) {
			// System.out.println("*** 1번 콜라 1500원 *** 2번 사이다 1300원 *** 3번 계산 ***");
			// System.out.println("1, 2, 3 중에 고르세요");
			// int choose = sc.nextInt();
				// if (choose == 1) {
					// if (money > 1500) {
						// money -= 1500;
						// coke++;
						// System.out.println("콜라: " + coke + "캔");
						// System.out.println("사이다: " + soda + "캔");
						// System.out.println("남은 돈: " + money);
					// } else {
						// System.out.println("남은 돈: " + money);
						// System.out.println("잔액이 부족합니다.");
						// money = -1;
					// }
				// } else if (choose == 2) {
					// if (money > 1300) {
						// money -= 1300;
						// soda++;
						// System.out.println("콜라: " + coke + "캔");
						// System.out.println("사이다: " + soda + "캔");
						// System.out.println("남은 돈: " + money);
					// } else {
						// System.out.println("남은 돈: " + money);
						// System.out.println("잔액이 부족합니다.");
						// money = -1;						
					// }
				// } else if (choose == 3) {
						// System.out.println("콜라: " + coke + "캔");
						// System.out.println("사이다: " + soda + "캔");
						// System.out.println("거스름돈: " + money);
						// money = -1;
				// }
		// }
	}
}