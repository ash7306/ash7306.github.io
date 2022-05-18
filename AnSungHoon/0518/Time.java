//사용자에게 초단위의 시간을 입력받아
//시간 분 초로 변환을 하는 프로그램
//입력 예)3666
//출력 예)1시간 1분 6초

import java.util.Scanner; 
//*****Scanner사용을 위한 import 꼭 넣기!!!

public class Time {
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		//스캐너 클래스의 변수 선언 후 = new 새로 불러옴 
								
		System.out.println("시간 분 초를 구하시오"); 
		
		System.out.print("초단위의 시간을 입력하시오."); 
		int x = scan.nextInt();
		int y = x % 3600;
		
		int second = (x % 60) ;
		int minute = (((x - second) / 60) % 60 );
		int hour = ((x - minute) / 3600);
				
		int hour2 = (x / 3600) ;			
		int minute2 = ( y / 60 );
		int second2 = ( x % 60);
				
		System.out.println((hours +"시간") + (minutes + "분") + (seconds + "초"));
		System.out.println((hours2+"시간") + (minutes2 + "분") + (seconds2+ "초"));
	}
}		