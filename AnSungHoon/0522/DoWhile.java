import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// while (false) {
			// 문장1
		// }

		// do를 보면 {}안으로 무조건 들어감 그후에
		// 조건이 맞으면 그 후에 식을 실행
		// 즉, '무조건 한번은 실행하고' 그 후에 판단
		Scanner scan = new Scanner(System.in);
		System.out.println("10나눌 수 입력");
			
		// 한번 입력 했는데 잘못 입력 했을때 다시 한번더 입력할 수 있는 기회를 줄때
		// do while문을 씀
		int num = 0; 
		do {
			num = scan.nextInt();
			if (num == 0) {
				System.out.println("0으로 나눌 수 없음 다시입력");
			}
		} while (num == 0);	// '{}'가 아니라 ';'을 써야함
		System.out.println(10 / num);		
	}	
}