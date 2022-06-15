
public abstract class Shape {	// 추상 클래스
	private int x;
	private int y;

	public Shape(int x, int y) {		
		this.x = x;
		this.y = y;
	}
	
	// 도형의 넓이를 구하는 것은 너무 추상적이다.
	// abstract 메소드 : 추상 메소드
	// 동작에 대한 구체적 X - 메소드 Body
	public abstract int getArea();	// 추상 메소드 
	// Body가 없다		// 컴파일에러 클래스에도 abstract를 붙여줌
	// Head만 존재

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}	

}
