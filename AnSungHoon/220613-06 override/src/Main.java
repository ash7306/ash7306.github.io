	
public class Main  {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.sound();
//		
//		Dog d = new Dog();
//		d.sound();
//		
//		Cat c = new Cat();
//		c.sound();
		// 각 같은 sound() 이지만 다다르다
		// 부모의 메소드가 호출되는 것이 아니라 자식의 메소드가 호출됨
		
		// a 가 가리키는건 강아지
		Animal a = new Cat();
		Animal a2 = new Dog();
		
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			// 컴파일은 되는데 실행 안됨
			// 고양이 인스턴스는 개가 아니니까 안됨
			d.sound();
		}
		System.out.println("---");
		
		if (a2 instanceof Dog) {
			Dog d2 = (Dog) a2;
			d2.sound();
		}
		
		Dog dog = new Dog();
		Dog p = new Poodle();
		
		Animal animal = p;
		animal.sound();
		
		Object o = new Dog();		
		// 오브젝트 클래스가 강아지 클래스의 상위 클래스이다
		// 자바는 Object(객체)라는 최상위 클래스가 존재함
		
		System.out.println(o.toString());
		
	}
}
