
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);

//		try {
//			 프로그램 흐름 문장
//			// 문장들 중에 예외(Exception)이 발생하면 
//		} catch (타입) {
//			catch 블럭이 예외를 처리하는 문장
//		}

		try {
			System.out.println("왼쪽 수 입력?");
			int left = scan.nextInt();
			System.out.println("오른쪽 수 입력?");
			int right = scan.nextInt();

			if (right != 0) {
				System.out.println("나눈 몫: " + (left / right));
			} else {
				System.out.println("분모에 0을 입력할수 없숨");
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해야합니다.");
			e.printStackTrace();//이 오류가 발생한 경로를 보여줘
								//제일 아래가 출력된게 제일 과거
		}
		System.out.println("프로그램 정상 종료");

	}
}
