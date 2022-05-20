public class TestTypes {
	public static void main(String[] args) {
		byte b = 10;		
		short s = 100;
		//int i = 1000;
		long l = 10000;	//10000은 기본 int 지만 long 타입의 변수에 담겨서 문제없음
		// 특별한 명시가 없다면 int로 취급함
		// 형이 변하고 있는 것을 '형변환'이라고 함
		// '자료형의 확장'은 큰문제 없이 이루어짐(작은통을 큰통에 넣을때)		
		// int i = 1000L; (long타입의 1000을 int i 변수에 넣으면 컴파일 에러)
		// '자료형의 축소'(큰통을 작은통에 넣을때)
		
		int i = (int) 1234548468454L;	// (바꾸고 싶은 형을 괄호 안에 넣으면 해결)
		// 1892854502라는 엉뚱한 숫자가 나옴. 손실을 감수하고 형변환을 했기 때문		
		
		int sum = b + s;	//short와 byte는 int보다 작은 형이라 가능
		System.out.println(sum);
		System.out.println(i);
		
		double b2 = 123.456;
		int i2 = (int) b2;	//123만 출력 소숫점 사라짐(손실을 감수하고 정수만 얻고싶을때)
		System.out.println(i2);
		
		char a = (char) 65;	// A
		int num = (int) a;	// 65
		System.out.println(num);
	}
}