public class OnelineIf {
	public static void main(String[] args) {
		boolean con = true;
		
		// if (con)		 // 조건문이 한 문장일 경우 {}생략 가능
			// System.out.println("참일 경우 실행할 문장");
		// else 
			// System.out.println("거짓일 경우 실행할 문장1");
		// System.out.println("거짓일 경우 실행할 문장2");
		
		// @@String result = (con) ? "참" : "거짓" ; 	// 삼항연산자
		// @@? 왼쪽엔 boolean값이 옴 콜론: 을 기준으로 참은 왼쪽 거짓은 오른쪽 값으로 초기화 함
		
		int r;
		if (con) {
			r = 100;
		} else {
			r = -100;
		}
		
		int result = (con) ? 100 : -100;	
		System.out.println(result);
		System.out.println("프로그램 종료");
	}
}