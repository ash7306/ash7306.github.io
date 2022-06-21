import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		//Arrays 클래스 , 		왜 리스트에 또 리스트를 넣어서 만들까?
		System.out.println(list);
		
//		List<Integer> test = Arrays.asList(10, 20, 30, 40, 50);
		//Arrays.asList형태로 왜 바로 안쓰냐면 원소 추가나 삭제가 안됨
		//test.add(60) XXXX 안됨
		
		//addAll전부 추가를 해준다
		list.addAll(Arrays.asList(60, 70, 80));
		System.out.println(list);
		
		list.removeAll(Arrays.asList(60, 70, 80));
		System.out.println(list);
		
		System.out.println(list.containsAll(Arrays.asList(10, 20, 30)));
		//10, 20, 30을 전부다 포함하고 있냐
		
		System.out.println("-----------------");
		//(인덱스값 여기부터, 여기까지(리스트의 사이즈)새 리스트를 만들어냄
		//리스트의 일부분을 호출할 수 있다.
		List<Integer> sub = list.subList(0, 3);
		System.out.println(sub);
		System.out.println(list);
		
	}
}
