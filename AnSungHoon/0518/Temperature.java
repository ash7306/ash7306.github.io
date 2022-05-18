import java.util.Scanner;

public class Temperature {	
	public static void main(String args[])	{
		Scanner input = new Scanner(System.in);
		System.out.print("화씨 온도는?: ");
		double f = input.nextDouble(); //화씨
				
		System.out.print((f - 32)*5/9);

	}
}