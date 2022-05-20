public class IntegerTypes {
	public static void main(String[] args) {
		byte b = 100;
		short s = 30000;
		int i = 10_000_000; //10,000,000
		long l = 123456789L;//L : 컴파일러에게 롱타입의 큰숫자라고 붙여줌(int 가 아님)		

		//int sum = 100 + 100L; 컴파일 에러남 int 가 L(long)을 담을수 없음
	
		// byte b2 = 100;
		// byte sum = b + b2;
		// System.out.println(sum); 컴파일 에러가 남 127을 넘음
	}
}