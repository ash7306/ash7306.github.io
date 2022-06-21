import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
//		LinkedList<String> list = new LinkedList<String>();
		List<String> list = new LinkedList<String>();
		//똑같은 리스트 임 차이점이 거의 없음
		list.add("문자열1");
		list.add("문자열2");
		list.add("문자열3");
		list.add("문자열4");
		
		list.get(0);
		list.get(1);
		list.get(2);
		list.get(3);
		
		System.out.println(list);
		for (String s : list ) {
			System.out.println(s);
		}
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
