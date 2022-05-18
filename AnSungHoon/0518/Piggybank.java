import java.util.Scanner;

public class Piggybank {	
	public static void main(String args[])	{
		Scanner input = new Scanner(System.in);
		System.out.print("500원 개수를 입력하시오.");
		int a = input.nextInt();
		System.out.print("100원 개수를 입력하시오.");
		int b = input.nextInt();
		System.out.print("50원 개수를 입력하시오.");
		int c = input.nextInt();
		System.out.print("10원 개수를 입력하시오.");
		int d = input.nextInt();
		
		System.out.print(500*a + 100*b + 50*c + 10*d + "원입니다.");
	}
}