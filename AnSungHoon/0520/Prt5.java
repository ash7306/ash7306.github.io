// 사용자의 학점, 점수를 입력 받아서
// 90점 이상 - A
// 80점 이상 90점 미만 B
// 70점 이상 80점 미만 C
// 60점 이상 70점 미만 D
// 60점 미만 F

import java.util.Scanner;

public class Prt5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		System.out.println("점수를 입력 하시오.");
		int score = scan.nextInt();
		
		char grade;
		if (score >= 90) {
			grade = 'A';		
		} else if (score >=80 ) {
			grade = 'B';
		} else if (score >=70 ) {
			grade = 'C';
		} else if (score >=60 ) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(grade + "학점");
	}
}