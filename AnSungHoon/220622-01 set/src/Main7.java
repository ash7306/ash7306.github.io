import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main7 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(Arrays.asList(50, 3, 22, 17, 30, 50, 17));
		//TreeSet 이라는 친구는 대소 비교를 할 수 있는 원소를 집어 넣으면
		//정렬된 순서처럼 원소들을 가지고 있는 Set이다
		
		for (int i : set) {
			System.out.println(i);
		}		
	}
}
