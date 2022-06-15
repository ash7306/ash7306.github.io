import java.util.Scanner;

// 회원 관리 프로그램
// 회원을 콘솔입력으로 등록 할 수 있게. 최대 10명
// 중복 등록이 되면 안 됨(이름, 키, 몸무게가 동일하면 중복입니다.)
// 하단의 비만 기준에 따라 집계를 해서 목록을 보여줘야합니다.

// 회원
// 이름
// 키
// 몸무게

// BMI 지수 = 몸무게(kg) / 키^2(m)

// 고도비만 : 35이상 
// 중도 (2단계비만) : 30 - 35
// 경도 (1단계비만) : 25 - 30미만
// 과체중 : 23 이상  - 25미만
// 정상 : 18.5이상 - 23미만
// 저체중 : 18.5 미만

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MemberManagement mem = new MemberManagement();
				
		while(true) {
			System.out.println("1. 회원입력\t" + " 2. 회원 목록\t" + " 3. 입력 회원의 bmi\t" + " 4. 키순(오름차순)으로 조회\t" + "5. 종료");	
			int x = scan.nextInt();
				
			switch (x) {
			case 1:			
				mem.saveMembers();
				break;
			case 2:
				mem.printMembers();
				break;
			case 3:
				mem.inputBmi();
				break;
			case 4:
				mem.AscendingHeight();
				break;
			case 5:
				System.out.println("프로그램종료");
				return;
			default :
				System.out.println("다시입력해주세요.");
				break;
			}			
		} 
	}
}
