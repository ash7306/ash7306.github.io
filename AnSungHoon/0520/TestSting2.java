public class TestSting2 {
	public static void main(String[] args) {
		String hello = "hello World"; // h,e,l,l,o char가 순서대로
		//이런 char 모음을 'index'라고 함
		//String hello = (String) 1234; 항변환 해도 안됨
		
		char h = hello.charAt(0);
		System.out.println(h);
		System.out.println(hello.charAt(1));
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		System.out.println(hello.charAt(5));	// " "띄어쓰기도 하나의 인덱스를 가짐
		System.out.println(hello.charAt(6));
		
		// System.out.println(hello.charAt(-1));
		// 컴파일은 문제 없으나 실행중 오류로 동작이 여기서 부터 멈춤
		
		int length = hello.length();	// 몇글자인지 int형태로 알려줌
		System.out.println(length); 
	}
}