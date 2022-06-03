import javax.print.attribute.standard.NumberOfDocuments;

class Car {
	private String color;
	private int speed;
	private int gear;	
	// 자동차의 시리얼 번호
	private int id;
	// 실체화된 Car 객체의 개수를 위한 정적 변수, 필드가 아님
	// 스태틱 메소드, 변수는 기울어진 텍스트로 표현
	private static int numberOfCars = 0;
//	private int numberOfCars = 0;   ==>	전부다 ++1 되어서 1로 존재 할것임
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		// 자동차의 개수를 증가하고 id 번호를 할당한다.
		id = ++numberOfCars;
	}
	
//	public static void printColor() {
//		System.out.println(color);
// color 라는 필드가 빨간줄 실행안됨
// ***스태틱한 메소드 안에서는 필드값을 가지고 무엇을 할수가 없다***
//	}
		
	public void printStaticNumber() {
		System.out.println(numberOfCars);
	}
	
	// 정적메소드
	public static int getNumberOfCars() {
		return numberOfCars;	
	}
}

public class CarTest3 {
	public static void main(String[] args) {
		
		
		
//		int n = Car.getNumberOfCars();
//		System.out.println("지금까지 생성된 자동차 수" + n);
//		
//		Car c1 = new Car("blue", 100, 1); 	// 첫번째 생성자 호출
//		Car c2 = new Car("white", 0, 1);	// 두번째 생성자 호출
//		
//		n = Car.getNumberOfCars();
//		System.out.println("지금까지 생성된 자동차 수" + n);

		
	}
}


