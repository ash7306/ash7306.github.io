
public class ColorBox extends Box {
	String color;
	
	//자식이 가지고있는 필드는 자신이 초기화 하면 되지만
	//부모가 가지고있는 필드는 부모꺼라서
	//부모클래스에서 먼저 초기화 시킨뒤 해야함
	public ColorBox(int length, int height, int width, String color) {		
		// super();
		// **부모의 빈 파라미터를 받는 생성자가 없어서 컴파일 오류가 남
		super(length, height, width);
//		super();
		this.color = null;
	}
	
	// 자식클래스를 생성할때 부모 생성자
	

	public String getColor() {
		return color;
	}
}
