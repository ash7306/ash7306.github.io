public class staticVariableAndConst3 {
	public static final int NUMBER = 100; // 전역 변수
	// 넓은 범위의 전역 변수가 많다면 관리가 너무 어려움.
	// 그래서 개발자들은 잘 쓰지 않는 방법이다
	// but 전역 변수에 final을 붙여서 상수로는 씀
	
	public static void test() {
		// NUMBER++;
		System.out.println("테스트메소드에서 : " + NUMBER);
	}
	
	public static void main(String[] args) {
		// NUMBER++;
		System.out.println("테스트메소드에서 : " + NUMBER);
		test();
		
		System.out.println(Math.PI);
		// 수학적 값을 상수로 만들어 사용함
		
		double a = Math.abs(-372);
		System.out.println(a);
		// 음수를 양수로 양수도 양수로 해주는 '스태틱 매소드'
		
		double r = Math.random();
		r = (int) (r * 10);
		System.out.println(r);
		// 랜덤 실수 만듦
	}
}