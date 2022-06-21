import java.util.Deque;
import java.util.LinkedList;

public class Main4 {
	public static void main(String[] args) {
		//stack - 후입선출법
		Deque<String> stack = new LinkedList<>();
		
		stack.push("10");
		stack.push("20");
		stack.push("30");	//상자의 아래에서 부터 차곡차곡 밀어넣음							
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());//후입선출, 맨위에꺼 부터 꺼낸다		
		
	}
}
