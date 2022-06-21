import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>(Arrays.asList("a", "b", "c", "d"));

		list.remove(0);
		list.remove("c");
		System.out.println(list);

		// 구현체가 두개나 있는데 뭘 써야 할까??
		// LinkedList '추가 삭제'가 '주 목적'이고 '자주' 일어 날때, 많은 작업이 필요하지 않음
		// ArrayList 모든 원소에 빨리 빨리 접근할 때 더 좋음, 인덱스의 위치를 알고 접근하는 것은 더 낫다
		// 둘의 사용방법은 완전히 같다. 왜? 둘다 List 인터페이스의 구현체 이니까
		
		
		// 큐라는 동작이 LinkedList에 있다 		큐   - 선입선출법
		LinkedList<String> down = (LinkedList<String>) list; //다운캐스팅
		down.addFirst("asdf");
		down.addFirst("asdf");
		down.removeFirst();
		down.getFirst();
		
		System.out.println(list);
	}
}
