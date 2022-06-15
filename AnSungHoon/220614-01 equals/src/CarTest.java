class Car {
	private String model;
	public Car(String model) {
		this.model = model;
	}
	
	// 객체끼리 비교를 위해 최상위 Object클래스를 만듦
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car)
			return model.equals(((Car) obj).model);
							// obj를 Car로 다운캐스팅 함
		else
			return false;
	}
}

public class CarTest {
	public static void main(String[] args) {
		String a = "HWM520";  
		Car firstCar = new Car("HWM520");
		Car secondCar = new Car(a);
		
		// 값 비교가 아니라 참조하고 있는 주소 비교
		if (firstCar == secondCar) {
			System.out.println("동일한종류의 자동차");
		} else {
			System.out.println("동일한종류의 자동차가 아님");
		}
				
		if (firstCar.equals(secondCar)) {
			System.out.println("동일한종류의 자동차");
		} else {
			System.out.println("동일한종류의 자동차가 아님");
		}				
	}
}
