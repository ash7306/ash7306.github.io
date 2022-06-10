class Car {

	public int speed;
	public int gear;
	public String color;
	
	public Car() {
		speed = 0;
		gear = 1;
		color = "red";
	}
	
	public void speedUp() {
		speed += 10;
	}
	
	public String toString() {
		return "속도: " + speed + " 기어: " + gear + " 색상: " + color;
	}
}	

public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
				
		for (int i = 0; i < cars.length; i++) 
			cars[i] = new Car();
		
		for (Car c : cars) 
			c.speedUp();
				
		for (Car c : cars) 
			System.out.println(c);
		
		
//		for (int i = 0; i < cars.length; i++) 
//			cars[i] = new Car();	// 다섯개 참조 생김			
//		for (int i = 0; i < cars.length; i++)
//			cars[i].speedUp();		// 각각의 참조
//		for (int i = 0; i < cars.length; i++)
//			System.out.println(cars[i]);			
	}
}