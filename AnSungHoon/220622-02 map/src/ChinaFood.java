import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 중국집 주문 가격 계산기

// 짜장면 : 2500
// 짬뽕 : 4000
// 볶음밥 : 4000
// 탕수육 : 10000

// 메뉴를 '추가'

// 계산 결과 출력 기능

public class ChinaFood {
	public static void main(String[] args) {
		Map<String, Integer> chiFood = new HashMap<String, Integer>();

		do {
			System.out.println("");
		} while(false); {
			System.out.println();
		}
			
		chiFood.put("짜장면", 2500);
		chiFood.put("짬뽕", 4000);
		chiFood.put("탕수육", 7000);
		chiFood.put("탕짜면", 5000);
		chiFood.put("볶음밥", 4000);
		chiFood.put("볶짜면", 5000);
		chiFood.put("냉면", 5000);

		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int sum = 0;
			System.out.println("1번 메뉴판 보기 2번 메뉴 추가하기 3번 계산서입력 4번 계산하기 5번 종료");
			int number = scan.nextInt();

			if (number == 1) {
				System.out.println(chiFood);

			} else if (number == 2) {
				System.out.println("추가하고싶은 메뉴");
				String menu = scan.next();
				System.out.println("그 메뉴의 가격");
				int price = scan.nextInt();
				
				chiFood.put(menu, price);

			} else if (number == 3) {
				System.out.println("계산할 메뉴입력");
				String s = scan.next();
				chiFood.get(s);

				System.out.println("그 메뉴 개수입력");
				int c = scan.nextInt();

				sum += (chiFood.get(s)) * c;

			} else if (number == 4) {
				if (sum != 0)
					System.out.println(sum + "원 나왔습니다. 감사합니다땡큐");
				else
					System.out.println("계산할게없음");
			} else if (number == 5) {
				System.out.println("프로그램종료");
				break;
			}
		}

//			default:
//				System.out.println("없는 메뉴");
//			}
////		}
	}
}
