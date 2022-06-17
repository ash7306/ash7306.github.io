package MyBank;

public class Account {
	int withdraw;	//출금
	int deposit;	//입금
	int balance;	//잔고
	int money;
	
	public Account() {		
	}
	
	public Account(int withdraw, int deposit, int balance) {
		super();
		this.withdraw = withdraw;
		this.deposit = deposit;
		this.balance = balance;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getWithdraw() {
		withdraw = balance - money;
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public int getDeposit() {
		balance = balance + deposit;
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "account [withdraw=" + withdraw + ", deposit=" + deposit + ", balance=" + balance + "]";
	}

}
