
public class Main4 {
	public static void main(String[] args) {
		try {
			int left = 10;
			int right = 0;
			
			if (right == 0) {
				//0으로 나눌려고 함(예외적인상황)
				//보고서 적어서 던질거임.
				//Exception 대신 내가 만든 메소드를 입력
				throw new MyZeroDivideException("0으로 나누는 예외적인 상황발생");
				//날려주는 타입을 구체적으로 상속으로 
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
