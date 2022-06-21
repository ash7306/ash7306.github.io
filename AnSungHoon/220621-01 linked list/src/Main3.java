import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		//링크드리스트를 큐라는 동작으로 추상적으로 사용 하겟음당 (추상적인 행동으로 집중가능)
		//큐는 보통 제일 앞에 놈을 꺼내거나 집어넣을려고 많이 씀
		//new LinkedList<>. 으로 사용하려면 너무 많은 매소드들이 뜸
		//사용하기 복잡함.. 그래서 큐를 사용한다
		
		queue.add("asdf1");
		queue.offer("asdf2");	//오퍼는 큐의 추상매소드로 애드랑 거의같은 기능을 함 
		
		System.out.println(queue);
		
		String elem1 = queue.poll();	//제일 앞에 있는 원소를 꺼내줌		원소가 없으면 null을 반환하고
		String elem2 = queue.remove();	//제일 앞에 있는 걸 꺼내서 참조를 알려줌	원소가 없으면 예외를 반환함
		
		System.out.println(elem1);
		System.out.println(elem2);
		System.out.println(queue);	//비어있음
		
	}
}
