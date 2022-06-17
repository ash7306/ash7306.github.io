interface PrintAll {
	void printAll();
}

public class Main {
	public static void main(String[] args) {
		//인스턴트스의 참조가 없는 완벽한 1회용 
//		new PrintAll() {
		PrintAll a = new PrintAll() {
		//지역변수로 라도 사용하겟다고 하면 인스턴스화 해서 사용한다
		//이름이 없는 인스턴스를 참조하고 있는 a
			@Override
			public void printAll() {
				// TODO Auto-generated method stub				
			}
		};
		
		
		
		class Point implements PrintAll {
			int x;
			int y;
			public Point(int x, int y) {
				super();
				this.x = x;
				this.y = y;
			}
			@Override
			public void printAll() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		
		Point p = new Point(10, 20);
	}
}
