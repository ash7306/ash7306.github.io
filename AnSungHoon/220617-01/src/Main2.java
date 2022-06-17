
public class Main2 {
	public static void main(String[] args) {
		String s = null;
		try {			
			int div = 10 / 0;
			System.out.println(s.equals("asdf"));
			
			System.out.println("ss");
				
		} catch (NullPointerException e) {
			System.out.println("널포인트익셉션처리");
		} catch (ArithmeticException e)	{
			System.out.println("수익셉션처리");
		//마지막에 부모형 예외처리
		} catch (Exception e) {
			System.out.println("모든예외처리는 여기서");
		}
		System.out.println("종료");
		
		//모든 예외처리 는 Exception부모의 상속 처리 됨
		//Exception로 모든 예외처리를 잡음
		//아니면 자식타입 XXXXException 자식클래스로 잡을 수 가 있다.
		//이때, catch의 순서에 유의 하여야 함
		//ex) 예외처리를 위에서 부터 하기 때문에 부모형인 Exception 예외가
		//먼저 오면 나머지 예외처리를 쓸 수가 없음(컴파일 에러)
	}
}
