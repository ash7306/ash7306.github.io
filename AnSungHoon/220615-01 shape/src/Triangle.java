
public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	
	
	// 부모가 가지고 있는 것을 추상 메소드를 구현
	// body를 가지고 있음
	@Override
	public int getArea() {
		return base * height / 2;
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}	

}
