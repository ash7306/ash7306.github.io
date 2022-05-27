import java.util.Scanner;

public class TestMethod5 {
	// 점수 하나를 전달받아 1 ~ 100 사이의 수이면 true을 반환하고,
	// 그렇지 않으면 false를 반환하는 메소드 작성
	public static int scoreSum(int ko, int eng, int math) {
			int sum = ko + eng + math;
			return sum;
	}
	
	// 사용자가 국어 영어 수학 점수를 입력 하는데 (사용자 입력값 1 ~ 100)
	// 입력한 점수와, 점수 합을 출력해보세요
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ko;
		int eng;
		int math;
		
		do {
			System.out.println("국어 점수 입력");
			int ko = scan.nextInt();
		
		} while (!(ko >= 1 && ko <= 100)) {
			System.out.println("틀림");	
		}		
		
		do {
			System.out.println("영어 점수 입력");
			int eng = scan.nextInt();
			
		} while (!(eng >= 1 && eng <= 100)) {
			System.out.println("틀림");	
		}

		do {
			System.out.println("수학 점수 입력");
			int math = scan.nextInt();
			
		} while (!(math >= 1 && math <= 100)) {
			System.out.println("틀림");	
		}
		
		System.out.println(ko);
		System.out.println(eng);
		System.out.println(math);
		System.out.println("점수의 총합: " + scoreSum(ko,eng,math));				
	}	
}