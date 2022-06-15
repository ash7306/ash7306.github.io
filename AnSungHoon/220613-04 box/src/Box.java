
public class Box {
	int length;
	int height;
	int width;

//	public Box() {
//		**생략되어 있다	
//	}
	
	public Box(int length, int height, int width) {		
		this.length = length;
		this.height = height;
		this.width = width;
	}
	
	public int getVolume() {
		return width * height * length;
	}
}
