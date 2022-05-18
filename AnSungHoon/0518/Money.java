import java.util.Scanner;

public class Money {	
	public static void main(String args[])	{
		Scanner input = new Scanner(System.in);
		System.out.print("상품의 가격은?: ");
		int x = input.nextInt();
		System.out.print("받은 금액은?: ");
		int y = input.nextInt();
		
		int a = (x * 1/10);	
		
		System.out.println("------------------");		
		System.out.println("받은돈: " + y);
		System.out.println("상품의 총액: " + x);
		System.out.println("부가세: " + a);
		System.out.println("잔돈: " + (y - x));
	}
}