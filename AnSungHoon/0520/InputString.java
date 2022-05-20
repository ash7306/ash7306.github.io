import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		System.out.println("한줄을 입력하시오.");
		scan.nextLine(); // 엔터를 한줄 가져오면서 입력하게 끔 함
		//print를 줄바꿈 ln없이 두개쓰면 하나만 출력되는것 방지
		String line = scan.nextLine();
		
		System.out.println(line);
	}
}