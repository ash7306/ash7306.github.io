// 오늘의 날씨를 물어보고
// "비"를 입력받으면
// 우산을 챙겨가라고 문자열 출력하는 프로그램
import java.util.Scanner;

public class Umbrella {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("오늘의 날씨?");
		String weather = scan.nextLine();
				 
		if (weather.equals("비"))
		{
			System.out.println("우산을 챙겨가세요");
		}
		
		System.out.println("좋은 하루 보내세요.");				
	}
}