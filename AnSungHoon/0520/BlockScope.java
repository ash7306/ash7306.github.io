// 중괄호로 Block을 만드는 것을 Scope라고 한다.
public class BlockScope{
	public static void main(String[] args) {
		int a = 10;			//지역변수(괄호안에서만 사용하는 변수)
		{	
			int b = 20;		//지역변수
			// int a = 99;  컴파일 에러남 변수를 또 똑같이 만들 수 없음
			System.out.println("가능한가?");			
			System.out.println(a);
			System.out.println(b);
		}
		// 바로 위 괄호가 끝나면 안에 변수(int b = 20;)는 사라짐
		// System.out.println(b); 컴파일 에러가 남
	}
}