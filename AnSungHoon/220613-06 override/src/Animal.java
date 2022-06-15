
public class Animal {
	public void sound() {
		System.out.println("동물의 소리는 제각각");
	}
}
// 부모클래스에 적어도
// 자식클래스에 가면 더 구체적으로 됨

class Dog extends Animal {
	@Override	// annotation	// ####부모클래스중에  
//	public void soumd() {		// soumd메소드가 없는데 제대로 한거 맞냐!?
//		System.out.println("ㅁㅁ");
//	}
	
	public void sound() {			// 부모 클래스 메소드의  헤드부분을 그대로 두고 
		System.out.println("멍멍");	// 바디 부분만 교체하는 것
	}	
	
	@Override
	public String toString() {
		return "강아지요";
	}
}

class Poodle extends Dog {
	@Override
	public void sound() {
		System.out.println("ㅂㅇㅂㅇ");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("ㅇㅇ");
	}
}
