package MyBank;
//은행 계좌
//필드 : 잔고 (int)
//메소드 : 입금(int) : void
//	   	 출금(int) : void >> 출금액이 보유 잔고 이상일 때 예외(부족한 금액이 얼마?)
//							를 발생시켜서 throws할 수 있게
//		getter() : int

public class Main extends Bank {
	public static void main(String[] args) {
		// 음행 계좌 객체 생성
		// 입금 / 출금 / 게터 테스트
		// 출금 호출 >> 예외 처리 (try - catch)		
		Bank b = new Bank();
		
		
		System.out.println("1.출금");
		b.InputMoney();
	}
}
