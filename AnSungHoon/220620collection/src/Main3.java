import java.util.ArrayList;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<>();	//ArrayList는 인터페이스인 List의 구현체
		//List얘는 인터페이스 이다 부모형으로도 호출할 수 있다
		//업캐스팅해도 추상적인 메소드로써 구현하고 있는 ArrayList도 사용 할 수 있다.

		//어레이 리스트는 구현체이며 추가적인 메소드, 필드
		//리스트처럼 추상적으로 사용하는 것이 더 편함
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.toString());	
		//투스트링이라는 행동이 있다. 오브젝트 클래스를 상속 하고 있을거니까. 오버라이딩 되있음 
		list.set(1, 15);		//해당하는 인덱스의 원소값을 변경해줌
		System.out.println(list);
		
		System.out.println(list.contains(20));
		//오브젝트의 형태로 내가 입력한 값이 있는지 물어볼 수 있다
		System.out.println(list.indexOf(30));
		//30값이 몇번째 인덱스에 있니??
		
		list.remove(2);	//인덱스 값을 입력하면 해당 인덱스의 값을 제거함
		System.out.println(list); 	//size가 3으로 변경됨
		
		list.add(0, 5);	//인덱스 번호와 집어 넣고자 하는 값
		System.out.println(list);	//size가 늘어남, index가 1씩 증가함
		
//		list.clear();	//싹다 날리고 싶다
		
		for (int i = 0; i < list.size(); i++) {			
			list.remove(i);			
		} 
		
		System.out.println("지운결과: " + list);
		//다안지워짐 앞에서부터 지우면서 인덱스 번호가 떙겨지고 사이즈가 줄기때문에
		System.out.println(list.isEmpty());
		//리스트가 다 지워졌는지 물음
		
	}
}
