public class IncDec {
	public static void main(String[] args) {
		int a = 55;
		a = 78;			
				
		a += 5;
		// a = a + 5 ; 		==> 83
		a -= 3;
		// a = a - 3 ;		==> 80
		a *= 2;
		// a = a * 2 ; 		==> 160
		a /= 4;
		// a = a / 4 ;		==> 40
		a %= 2;
		// a = a % 2 ;		==> 0
		
		//주의점 대입연산자(=) 앞에 산술연산자(-+*/%)가 와야함
		//변수의 이름에 변경된 값을 다시 넣고 싶을 때
		System.out.println(a);
	}
}