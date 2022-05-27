// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드.
import java.util.Scanner;

public class Q3 {
	public static int length(String a, String b){
		int lengthA = a.length();
		int lengthB = b.length();
		return lengthA + lengthB;
	}	
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 두개를 입력하시오.");
		String first = scan.nextLine();
		String second = scan.nextLine();
		
		int lengthSum = length(first, second);
		System.out.println(lengthSum);	
	}
}