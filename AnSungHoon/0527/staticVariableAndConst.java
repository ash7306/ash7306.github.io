public class staticVariableAndConst {
			// 정적변수와 상수
	public static void main(String[] args) {
		int i = 10;
		// i 는 변수 		
		i++;
	
		final int MY_NUMBER = 22;
		// MY_NUMBER++;
		// 이 상수는 변하게 할 수 없음 컴파일 에러 뜸
		// 상수 : 수식에서 변하지 않는 수
		// 상수는 변수와의 차이점을 위해 전부 대문자를 사용
		
		final int ASDF;
		ASDF = 10;
		// 최초의 대입연산은 상수도 초기화가 가능함
		// ASDF = 15;
		// But 그다음 초기화는 안됨 컴파일 에러.
		final double PI = 3.14;
		System.out.println(5 * 5 * PI);
	}
}