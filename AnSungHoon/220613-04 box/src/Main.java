
public class Main {
	public static void main(String[] args) {
		Box box1 = new Box(10, 10, 0);
		box1.width = 10;
		box1.length = 10;
		box1.height = 10;
		
		System.out.println(box1.getVolume());
		
		ColorBox cb1 = new ColorBox(0, 0, 0, null);
		cb1.width = 10;
		cb1.length = 10;
		cb1.height = 10;
		cb1.color = "Red";
		
		System.out.println(cb1.getVolume());
		System.out.println(cb1.getColor());
		
		ColorBox cb2 = new ColorBox();
		System.out.println(cb2.width);
		System.out.println(cb2.length);
		System.out.println(cb2.height);
		System.out.println(cb2.color);
		// 부모의 생성자를 호출 하게끔 되어 있음
	}
}
