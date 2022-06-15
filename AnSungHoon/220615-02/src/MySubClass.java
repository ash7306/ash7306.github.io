
public abstract class MySubClass extends MyClass {
	//추상 클래스를 상속하는 추상 클래스
	@Override
	public final void myMethod() {
		//메소드에 final을 쓰면 자식 클래스에서 오버라이드(재정의)를 할수가없다
		//자식클래스에서 오버라이드 하려고 하면 컴파일 오류가 남
		System.out.println("자식 클래스에서 구현되었습니다.");
	}
	
	public abstract void myMethod2(); 
}
