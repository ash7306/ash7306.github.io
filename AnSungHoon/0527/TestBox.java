public class TestBox {
	public static void main(String[] args) {
		// Box none = null;		
		// none.width = 10;
		// 참조형 변수인데 null을 참조한다. = 참조 할게 없다.
		
		
		// Box의 변수가 하나의 Type으로 사용됨
		Box box1 = new Box();	// 인스턴스
		// Box 인스턴스가 new(새로) 만들어 졌음
		box1.width = 3;
		box1.length = 3;
		box1.height = 3;
		
		Box box2 = new Box();
		
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
		
		// System.out.println("부피: " + box1.volume);
		box1.getVolume();
		
		box1.printAllState();
		box2.printAllState();
		// 같은 동작이지만 인스턴스의 상태에 따라 다른 값이 나옴
		
		// 모든 box는 가로세로높이의 값을 가지고 있지만
		// 박스별로 가로세로높이가 다르다.
		
		
		// System.out.println(box1.width);
		// System.out.println(box2.width);
		
		// box1.width = 5;
		// System.out.println(box1.width);
		
		// box1 과 box2는 별개의 인스턴스지만 
		// 둘은 동일한 값을 가지고 있다.
		
		// 인스턴스란? 
		// 
	}
}
	