import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가","나","다","라","다","가","다"));
								//ArrayList의 생성자에 List를 집어 넣어서 사용 가능함
								//Collection타입을 상속하는 객체들은 다 사용이 가능함
		Set<String> set = new HashSet<>(list);
		
		System.out.println(set);
		
//		for (int i = 0; i < list.size(); i++) {
//			set.add(list.get(i));
//		}		
//		System.out.println(set);
		
		
	}
}
