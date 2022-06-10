class Car {

	// 필드 선언
	private int speed;
	// 만약 정수가 아니라면!! 정수 부분만 필드에 취하겠다는
	// 전략을 나타내는 메소드 이다!!
	// ex) 79.2중에 79만 받아서 오게끔
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}
	
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("실수 버전 호출");
	}
}

public class CarTest2 {	
	public static void main(String[] args) {
			Car myCar = new Car();
			myCar.setSpeed(100);
			myCar.setSpeed(79.2);
			
			myCar.setSpeed(1000L);
			// long타입은 int형은 못넣음 손실이 일어남
			// 그러나 double은 큰범위 니까 둘중에 담을수 있는 실수형에 출력됨
			myCar.setSpeed('a');
			// 'a' 정수로 표현되니까
			
			
	}
}