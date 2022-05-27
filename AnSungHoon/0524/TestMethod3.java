public class TestMethod3 {
	public static int getSum(int a, int b) {
	// int getSum 나가는 통로	// 메소드의 입력부분() parameters 파라미터
							// 들어오는 통로 
							// 30 값을 a라는 이름으로, 60을 b라는 이름으로 쓰겟다
		return a + b;		// 파라미터는 지역변수다.
	}
	public static int getMultiply(int a, int b) {
		return a * b;		
	}
	// 문자열 출력 메소드
	public static String getStr(String a, String b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int sum = getSum(30, 60);
		System.out.println(sum);
		System.out.println(getSum(100, 200));
		System.out.println(getMultiply(100, 200));		
		
		System.out.println(getStr("aaa","bbb"));
	}
}