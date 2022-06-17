import java.util.InputMismatchException;
import java.util.Scanner;

public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideException{
		if (right == 0) {					//ㅇ예외적인 상황을 내부안에서 말고 다른데 던져서 해결할때
			throw new MyZeroDivideException("divide 할 수 없음");
			//
		} else {
			return left / right;	
		}
		
	}
	
	public int myFunction() {
		// 아직 미완성
		
		throw new UnsupportedOperationException("내일 만들게, 아직 덜만듦요");
		
	}
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in)	;
//		int result = divide(100, 50);
			//RunTimeException
		scan.nextInt();
		//Exception을 강제 하지 않음 runtime임
		//InputMismatchException
		//에러와 예외를 다가지고 있는 
	}
}

