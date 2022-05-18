import java.util.Scanner;

public class Reverse {	
	public static void main(String args[])	{
		Scanner input = new Scanner(System.in);
		System.out.print("5자리 정수를 입력하시오.");
		int x = input.nextInt();		
		
		int a = (x%10);
		int b = ((x%100-a)/10);
		int c = ((x%1000-b)/100);
		int d = ((x%10000-c)/1000);
		int e = ((x%100000-d)/10000);
				
		System.out.println("역순은: "+a+b+c+d+e);
		System.out.println("역순의 각 자릿수의 총합: "+(a+b+c+d+e));
		//5+40+300+2000+10000
		//5+4+3+2+1
	}
}