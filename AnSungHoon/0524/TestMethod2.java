public class TestMethod2 {
	// 메소드의 이름. 영소문자. 변수이름 지을때랑 똑같음. 두번 째 단어는 첫글자 대문자
	// 메소드의 이름은 기능에 대한 이름을 담다 보니 주로 ##동사## 가 이름으로 옴
	public static int sum() { 	// return type : void (뱉어낼게 없다)
	// int 값 하나를 가져간다		// return type이 비어있다.
	// 메소드의 이름은 항상 ()괄호가 있음
	// 메소드의 호출도 마찬가지
		
		int a = 10;
		int b = 20;
		int c = a + b;		
		return c;
	// return 우측의 값을 가지고 main 메소드로 간다			
	}
	public static double pi() {
		double a = 3.14;
		
		return a;
	}
	public static void main(String[] args) {
		System.out.println("시작");
		
		int result = sum();
		// sum() - 30을 언제나 만들어 내는 기계
		System.out.println(result);
		
		System.out.println(pi());		
		
		System.out.println("끝");
	}
}