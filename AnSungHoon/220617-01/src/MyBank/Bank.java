package MyBank;
import java.util.Scanner;

public class Bank {
	Scanner scan = new Scanner(System.in);
	Account a = new Account();
	
	int m = scan.nextInt();
	
//	money = 10000;
	public int InputMoney() {
		a.money = scan.nextInt();
		
		return a.getDeposit();
	}	
}

