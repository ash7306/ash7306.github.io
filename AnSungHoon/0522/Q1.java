// 0~9까지의 무작위의 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게 하여
// 틀릴 경우 종료
// 예) 램덤 수가 6일 경우 
// 사용자가 입력 6 12 18 21x 종료
import java.util.Scanner;
import java.util.Random;

public class Q1 {
	public static void main(String[] args) {	
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int number = random.nextInt(8) + 2;
		
		System.out.println("랜덤수는: " + number);
						
		int anwser = 0;
		while (true) {
			anwser += number;
			int	userInput = scan.nextInt();					
			
			if (anwser != userInput) {
				System.out.println("틀림");				
				break;
			}
		} 
		String x = random.nextline();
		System.out.println(x);
	}	
}