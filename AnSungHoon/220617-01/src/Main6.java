// 은행 계좌
// 필드 : 잔고 (int)
// 메소드 : 입금(int) : void
//        출금(int) : void >> 출금액이 보유 잔고 이상일 때 예외(부족한 금액이 얼마?)를 발생시켜서 throws...
//        getter() : int

class BankWithDrawException extends RuntimeException {
	public int lack;
	
	public BankWithDrawException(String messge, int lack) {
		super(messge);
		this.lack = lack;
	}
	
	public int getLack() {
		return lack;
	}
}

class BankAccount {
	private int balance;
	public BankAccount(int balance) {
		this.balance = balance;
	}
	public void deposit(int amount) {
		balance += amount;
	}
	//출금할때 예외처리
	public void withdraw(int amount) throws BankWithDrawException{
		if (balance >= amount) {
			balance -= amount;		
		} else {
			throw new BankWithDrawException("잔고가 부족함", amount - balance);
		}
	}
		
	public int getBalance() {
		return balance;
	}
}

public class Main6 {
	public static void main(String[] args) {
		// 은행 계좌 객체 생성
		BankAccount b = new BankAccount(1000);
		// 입금 / 출금 / 게터 테스트
		b.deposit(1000);
		
		try {
			b.withdraw(2500);
			System.out.println(b.getBalance());
			// 출금 호출 >> 예외 처리 (try - catch)
			
		} catch (BankWithDrawException e) {
			System.out.println(e.getMessage() + e.getLack());
			System.out.println(e.getLack());
			
		}
	
	}
}











