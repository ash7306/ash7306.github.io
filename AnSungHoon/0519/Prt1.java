// 사용자에게 정수 하나를 입력받아서
// 입력 값 -2 ~ +2 범위의 정수를 출력해보세요
// 예) 7 -> 5 6 7 8 9
import java.util.Scanner;

public class Prt1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하시오");
		int x = scan.nextInt();
		
		System.out.println("--------------");		
		System.out.print((x -= 2)+ " ");
		System.out.print(++x + " ");
		System.out.print(++x + " ");
		System.out.print(++x + " ");
		System.out.print(++x);
	}
}