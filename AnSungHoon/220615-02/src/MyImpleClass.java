
public final class MyImpleClass extends MySubClass {
	//final : 더이상 확장 불가 설정
	//	@Override
	//	public void myMethod() {		
	//		System.out.println("새롭게 정의하였습니다");
	//	}	
	//부모 클래스인 MySubClass에서 final로 메소드의 오버라이드를 막음
	
	//1번은 MySubClass가 
	@Override
	public void myMethod2() {		
		System.out.println("마이 메소드2 오버라이드 구현");
	}
	//하위클래스에서 모든 동작을 오버라이드 하여서 
	//오버라이드된 이 동작들로 실행됨
	
	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		m.myMethod();
		
		MySubClass sub = (MySubClass) m;
		sub.myMethod();
		sub.myMethod2();
			
		//MyClass는 my메소드만 가능
		
		//MySubClass는 my메소드가 가능하나 my메소드2는 구현은안됨
		
		//MyImpleClass는 my메소드도 가능하고 my메소드2도 구현가능
		
		//구현은 자식 클래스에 되어있을때
		
		
	}
}
