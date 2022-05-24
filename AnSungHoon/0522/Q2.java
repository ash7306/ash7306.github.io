import java.util.Scanner;
import java.util.Random;

public class Q2 {
	public static void main(String[] args) {
		Random random = new Random();
		String answer = "love";	
		String sceret;
		int tries = 0;
		Scanner scan = new Scanner(System.in);
 		
		while (true) {
			System.out.println(" 세자리 비밀번호(문자형)를 입력하세요: ");
			sceret = scan.nextLine();
			tries++;			
			
			if (sceret.equals("love")) {
				System.out.println("정답");
				break;				
			}
			else if (tries == 3) {
				System.out.println("세번기회끝");				
				break;
			}
			
		}			
	}
}	