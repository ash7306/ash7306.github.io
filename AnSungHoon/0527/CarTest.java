class Car {
	// 필드 정의
	String color;		// 색상	
	int speed;			// 현재 속도
	int gear;			// 현재 기어
	void print() {
		System.out.println("(" + color + ", " + speed + ", " + gear + ")");		
	}	
}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();		// 객체 생성((인스턴스화)new 클래스이름())
		myCar.color = "red";
		myCar.speed = 0;			// 객체의 필드 변경
		myCar.gear = 1;
		myCar.print();				// 객체의 메소드 호출
	

		// 색상:blue 속도:60 기어:3 
		myCar.color = "blue";
		myCar.speed = 60;			// 기본 자동차의 색 속도 기어를 바꾼것이고
		myCar.gear = 30;
		
		Car myCar2 = new Car();		// 새 자동차를 뽑은 것
		myCar2.color = "blue";
		myCar2.speed = 60;			
		myCar2.gear = 3;
		myCar2.print();	
	}
}