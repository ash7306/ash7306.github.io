public class Method {
	public static int increase(int a) {
		a++;
		return a;
	}
	// 메소드는 return값을 하나만 가질 수 있다.
	// public static int, int increase(int a) {
		// return 20, 30;		
	// }
		
	// 숫자 하나가 짝수, 홀수 인지 알고 싶음.
	// 1리턴타입 2이름(3파라미터들) 	
	public static boolean isEven(int i) {
		return i % 2 == 0;		 
	}
		
	public static void main(String[] args) {
		int a = 10;
		// increase(a);	// Call By Value 값에 의한 호출
						// 변수를 넣어도 변수값이 복사됨 그변수가 복사되는것이 아니라
		System.out.println(a);
		System.out.println(increase(a));
		
		boolean result = isEven(a);
		System.out.println(result);
	}
}