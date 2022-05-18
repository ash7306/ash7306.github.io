import java.util.Scanner;

public class Volume {	
	public static void main(String args[])	{
		Scanner input = new Scanner(System.in);
		System.out.print("구의 반지름은?: ");
		double r = input.nextDouble();
		double result = Math.pow(r,3);
		
		System.out.println((r*r*r)*4/3);
		System.out.print(result*4/3);
	}
}