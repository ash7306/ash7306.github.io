import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		//set 이라는 친구는 리스트 처럼 인터페이스로 구현되어 있음
		HashSet set = new HashSet();	//유틸 패키지로 존재
		//해쉬라는 값을 가지고 중복을 검사하는 셋
		
		boolean b1 = set.add("qwer");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer");
		
		System.out.println(set.size());
		//but 사이즈는 = 3이 아니라 2라고 뜸 why?
		//set이라는 친구들은 add를 할 때 자기가 가지고 있는 원소가 중복되는 것이 있다면
		//추가하지 않고 중복을 걸러줌
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(set.size());
		System.out.println(set.toString());
		
//		set은 원소들의 인덱스를 가지고 있지 않음 (get이라는 메소드가 없음)
//		set.get(0);
		
//		for이치 문은 가능함
		for (Object o : set) {
			System.out.println(o);
		}	
		
//		이터레이터도 사용 가능
		Iterator<Object> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
//		인덱스 값이 없기 때문에 
			
		}
	}
}
