import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
				
//		값이 배열안에 존재하는 것이 아니라 그 객체의 인스턴스를 참조함
//		칸을 만들어서 55.55를 넣는게 아니고 55.55를 참조한다
//		리스트는 원시형 자료형을 바로 닮을수 없다
//		배열의 단점을 사용하기 편한형태로 클래스를 제공해줌
//		여러개의 자료들을 가질 수 있는 객체
//		길이값을 우리가 정해주지 않고 추가만 함
		final int a = 3;
		ArrayList list = new ArrayList();
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));		//100을 하나의 객체로 만들어서 그 값을
		list.add(Double.valueOf(55.55));	//박싱, 랩핑
//		객체를 추가시킬수 있음 , 원시형,기본형을 다를수 없음 객체만
			
		list.add(500);		//500이라는 값이 인티저로 인스턴스가 만들어지고(객체로 만들어지고) 저절로 변환이 됨 (auto-boxing 오토박싱)
		list.add(123.123);	//객체의 형으로 포장해서 만들어준다
		
		int size = list.size();
		System.out.println(size);	//몇개를 집어넣었지?
		
		System.out.println(list);
//		[문자열 객체, java.lang.Object@15db9742, 100, 55.55, 500, 123.123]
//		인덱스:0			1					 2		3	  4		5	 					
//		동적으로 삽입된 순서에 따라 인덱스 번호가 주어짐
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println("------------------");
				
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		System.out.println("------------------");
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
