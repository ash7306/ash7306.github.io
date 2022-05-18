// 사용자에게 국어, 영어, 수학 점수를 정수로 입력받아
// 총점과 평균점수를 출력하는 프로그램

import java.util.Scanner; 
//*****Scanner사용을 위한 import 꼭 넣기!!!

public class Score {
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
								
		System.out.println("총점과 평균점수 구하기"); 
		
		System.out.print("국어 점수를 입력하시오: "); 
		int kor = scan.nextInt();
		
		System.out.print("영어 점수를 입력하시오: "); 
		int eng = scan.nextInt();
		
		System.out.print("수학 점수를 입력하시오: "); 
		int math = scan.nextInt();
		
		int sum = kor + eng + math ;
		
		System.out.println("총점: " + sum);
		System.out.println("평균점수: " + sum / 3);
		
	}
}		