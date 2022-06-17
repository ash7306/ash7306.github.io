class MyClass {
	public static int num;
	// jvm은 변수부터 말들고 메소드 만들고 스태틱을 만듦
	public int fields = 1000;
	//얘는 코드를 만들어 놓은거지 객체로 생성된게 아님
	//new로 클래스를 인스턴스화 하고 사용해야함
	
	static {		
		MyClass2.hello();
		System.out.println("테스트테스트");
	}	
}

class MyClass2 {
	static void hello() {
		System.out.println(MyClass.num);
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println("시작~~~~");
//		System.out.println(MyClass.fields);//안됨
						// new MyClass().fields로 사용		
		MyClass2.hello();		
	}
}
