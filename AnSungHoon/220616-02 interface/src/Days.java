
public interface Days {
	int NUM = 10;
//	public static final int NUM = 10;
//	생략되어 있음
	
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	int WENDSDAY = 3;
//	인터페이스는 상수를 정력해놓고 사용할 수 있다.
	
}

interface MyInterface {
	
	//바디가 없는 추상메소드
	//상속받는 모든 클래스에서 void printHello();를
	//오버라이드해줘야함
	default void printHello() {
		System.out.println("hello");
	}
	//인터페이스를 좀더 쉽게 쓰라고 default를 사용함
	//무조건 오버라이드 해야하지만 기본메소드형태를 만들어 놓게 해줌
	//쉽게 말하면 일반 디폴트가 없을때는 추상메소드로 바디를 쓸 수 없지만
	//오버라이드 하기전에 이미구현되어 있는 추상메소드임
	//물론 오버라이드로 다른 클래스에서도 사용 가능함
	default String printHello2() {
		return "hello";
	}
	
	public static void myStaticMethod() {
		
	}
	//객체가 아닌 정적기능(펑션)임
	
	static int sum(int a, int b ) {
		return a + b;
	}
}

