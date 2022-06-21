import java.util.ArrayList;
import java.util.List;

class Point2D {
	private int x;
	private int y;

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

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

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}

public class Main {
	public static void main(String[] args) {

		// 숫자두개를 표현할 수 있는 클래스 만들어서 사용 <인티저>는 숫자하나만 사용가능해서 안됨
		List<Point2D> list = new ArrayList<>();
		// 0,0
		list.add(new Point2D(0, 0));
		// 5,5
		list.add(new Point2D(5, 5));

		Point2D p = list.get(0);
		System.out.println(p);

		Point2D p2 = list.get(1);
		System.out.println(p2);

		// 리스트에 0,0 좌표 객체가 있는지??
		// 리스트에 0,0 좌표 객체의 인덱스는??

		list.contains(new Point2D(0, 0));
		list.indexOf(new Point2D(0, 0));

		// 모든 클래스의 객체는 자신의 동등함을 알려는 이퀄스를 이용가능 (왜? 모든객체는 오브젝트를 상속하고 있으니까)
		// false
		System.out.println("오버라이드 전:" + new Point2D(0, 0).equals(new Point2D(0, 0)));

		System.out.println(list.contains(new Point2D(0, 0)));
		// 포인트2d의 이퀄스를 호출해서 참조가 같을 때만 트루
		// 동등함을 알려면 이퀄스를 '재정의' 해야한다
		System.out.println(list.indexOf(new Point2D(0, 0)));

		System.out.println(list.remove(new Point2D(5, 5)));
//		System.out.println(list.remove(1));

		System.out.println(list);
	}
}
