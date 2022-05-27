public class Box {
	// Box를 표현하는 클래스일 경우 #상태와 #기능 두개로 나뉨
	// 값/#상태 -> 멤버변수 (member variable) / 필드 (fields) 들은 객체의 구성요소들임
	int length;
	int width;
	int height; 	// 이 필드들은 메소드printAllState()에서 쓸 수 있음
	int volume = length * width * height;
	// 메소드/#기능 or 동작
	public void printAllState() {
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
	}
			
	// 박스는 자기자신의 부피를 구해서 정수형 값으로 알려줄 수 있다.
	// int형 정수를 (반환)한다.
	
	public int getVolume() {
		return width * length * height;
		
	}
}