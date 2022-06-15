import java.util.Arrays;
import java.util.Scanner;

public class MemberManagement {
	Scanner scan = new Scanner(System.in);
	int count = 1;

	private Member[] members;
	private Member2[] members2;
	
	public MemberManagement(Member... members) {
		this.members = members;		
	}
	
	public MemberManagement(Member2... members2) {
		this.members2 = members2;		
	}
	
//	public MemberManagement(Member2... members2) {
//		this.members2 = members2;
//	}

	// 1. 회원입력
	public Member InputMember() {
		Scanner scan = new Scanner(System.in);
		System.out.println("회원 이름, 키(m), 몸무게(kg)를 입력");
		String name = scan.nextLine();
		double height = scan.nextDouble();
		double weight = scan.nextDouble();

		return new Member(name, height, weight);
	}

	public void saveMembers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("회원몇명 입력?");
		int x = scan.nextInt();
		
		if (x < 10 ) {
			for (int i = 0; i < x; i++) {
				members = Arrays.copyOf(members, members.length + 1);				
				members[i] = InputMember();
			}
		} else { 
			System.out.println("최대 열명까지 입력이 가능합니다.");			
		}	  
	}

	// 2. 회원 전체 목록
	public void printMembers() {
		for (int i = 0; i < members.length; i++) {
			System.out.print(count + "번 ");
			members[i].printMember();
			System.out.println("-----------");
			count++;
		}
	}

	// 3. bmi
	public void inputBmi() {
		System.out.println("Bmi를 원하는 회원번호를 입력");
		int i = scan.nextInt();
		System.out.println(i + "번 회원");
		members[i - 1].printBmi();
	}

	// 4. 기준에 따른 목록
	public void AscendingHeight() {
//		Member2[] members2 = new Member2[];		
		System.out.println("1. 키 오름차순" + " 2. 몸무게 오름차순");
		int x = scan.nextInt();

		if (x == 1) {
			Arrays.sort(members);
			for (Member m : members) {
				m.printMember();
			}
		} else if (x == 2) {
			Arrays.sort(members2);
			for (Member2 m2 : members2) {
				m2.printMember();
			}
		}
	}
}
