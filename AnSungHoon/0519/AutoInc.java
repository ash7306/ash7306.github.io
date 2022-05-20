public class AutoInc {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a++); // 10 a값을 먼저 사용하고 더하겟다
		System.out.println(++a); // 12 먼저 두번 더하고 a값을 사용
		// 연산자가 순서대로
		// 변수 값 10 +1 +1 = 12 
		
		System.out.println(a++); // 12 
		System.out.println(a + ++a); // 13 + 14 = 27
		
				
		// 복합 대입 연산자 += =+ ...
		// a += 1; // 11
		// a -= 1; // 10
		
		// 증감연산자
		// int a = 10;
		// a++;
		// a++;
		// a++;
		
		// a--;
		// System.out.println(a); //12
	}
}