public class staticVariableAndConst2 {
	public static void printTest(int param) {
		param++;
		// 매개변수
		// param이라는 변수의 값은 변화됨		
		System.out.println(param);
	}
	
	public static void printTest2(final int param) {
		// param++;
		// param이라는 변수의 값은 변화됨		
		System.out.println(param);
	}
	
	public static void main(String[] args) {
		int inner = 10;
		final int TEST_SCOPE = 20;
		printTest(TEST_SCOPE);
		printTest2(TEST_SCOPE);
		System.out.println("메인에서의 상수값: " + TEST_SCOPE);
		
		{
			System.out.println(inner);
			System.out.println(TEST_SCOPE);
			
			// final int TEST_SCOPE; X
			final int BLOCK = 100;			
		}
		// System.out.println(BLOCK); X
	}
}