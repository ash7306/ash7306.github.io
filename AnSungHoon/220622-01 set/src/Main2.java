import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana");
		
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			//추가한 순서대로 출력되는게 아님
		}
		//Set은 집어넣은 순서를 저언혀 신경쓰지 않음
		//중복을 방지하는 것에 집중한다.
		
		System.out.println(set.contains("banana"));
		System.out.println(set.contains("donut"));
		//
		
	}
}
