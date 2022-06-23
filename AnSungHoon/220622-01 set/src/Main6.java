import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		//추가된 순서를 기억하기 위한 구현체임 (인덱스는 없다)
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");
		
		for (String s : set) {
			System.out.println(s);
		}
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple","donut","egg","fanta"));
		//LinkedHashSet 추가한 순서가 그대로 유지가 되더라
		//그래도 인덱스는 없다
		set2.addAll(set);
		//링크드해쉬셋을 해쉬셋에 넣어서 순서가 제멋대로다
		System.out.println(set2);
		
			
	}
}
