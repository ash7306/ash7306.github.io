import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();//노란색밑줄이 나오는 이유 ,객체로 쓰지말고 제네릭<>으로 쓰라는 것
		ArrayList<Integer> list = new ArrayList<Integer>();
//		원시형타입을 쓸수 없음, 객체의 형태로 사용할 것이기 때문에
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
//		list.add("asdf");	<>제네릭으로 인티저만 넣는다며!? 하면서 안됨 
		
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {			
			sum += list.get(i);
			//안됨 왜? 오브젝트라는 타입으로 알려줌
		} 
		System.out.println(sum);
		
	}
}
