
public class Main {
	
	public static void someMethod(int param) {
	
	}
	
	public static void sum() {
		
	}
		
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	// 이름 만으로 메소드의 중복을 따지는게 아니라 파라미터를 따짐
	// 이름 만 같고 파라미터 의 순서, 타입, 개수 등이 다르면 다른 메소드 이다
	public static void sum(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
//		someMethod(3873.03736);
//		someMethod("3873.03736");

		// Method Overloading
//		System.out.println(123);
//		System.out.println(123.123);
//		System.out.println("123.123");
		
		sum(10 ,40);
		sum(10.0 , 40.0);
		// 다양한 타입에 대응할 수 있는 메소드 ==> 메소드 오버로딩
	}
}
