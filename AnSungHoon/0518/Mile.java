import java.util.Scanner;

public class Mile {	
	public static void main(String args[])	{
		double mile;
		double kilomiter;
		Scanner input = new Scanner(System.in);
		System.out.print("마일을 입력하시오: ");
		mile = input.nextDouble();
		
		kilomiter = mile * 1.609;
		System.out.print(mile + "마일은" + kilomiter + "킬로미터입니다.");
	}
}