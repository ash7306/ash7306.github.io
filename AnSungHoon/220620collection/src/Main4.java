import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		//List로 인터페이스 형으로도 다룰 수 가 있다.
		//다른 ArrayList들도 List 하나로 다 다룰 수 있음
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
		System.out.println(list.contains(new String("banana")));
		//equals로 비교하고 있다. ==가 아니라
		list.remove("banana");
		//인덱스뿐만 아니라 해당 문자열 값의 동등함을 비교하고 같을때 지워줌
		
		System.out.println(list);
		list.add(1, "banana");
		
		//위의 리스트에서 5글자 문자열만 찾아서 지우기
		
		//원소 하나하나를 볼 수 있게끔 도와줌
		
		Iterator<String> iterator = list.iterator();
		//iterator : 반복자!!		iterable이라는 인터페이스를 상속하고 있음
		//값이 있냐? 있으면 가져와!
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
		
		//hasNext boolean값으로
		//이터레이터 리스트가 값을 가지고 있니?
		while (iterator.hasNext()) {
			String str = iterator.next();			
			if (str.length() == 5) {
				iterator.remove();
			}
		}
		//원소를 삭제할 때는 iterator가 필수다!
		
		System.out.println(list);
			
	}
}
