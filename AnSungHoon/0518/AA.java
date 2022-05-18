import java.util.Scanner;

public class AA {	
	public static void main(String args[])	{
		Scanner input = new Scanner(System.in);
		System.out.print("두가지 정수중에 더 큰 정수를 입력하시오.");
		int A = input.nextInt(); 
		
		System.out.print("그 다음 정수를 입력하시오.");
		int B = input.nextInt();

		System.out.print(A + "을" + B + "으로 나눈 몫은" + 23/10 + "이고 나머지는" + 23%10 +"입니다.");
	}
}