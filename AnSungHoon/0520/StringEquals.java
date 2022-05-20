public class StringEquals {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";	//b도 같은 참조를 만들어냄
		String llo = "llo";
		
		System.out.println(a == b); // true
		// 값을 확인하는 것이 아니라 참조하는 대상이 같은지
		System.out.println(a == ("He" + llo)); // false
		// ("He" + llo) 이두개를 결합한 새로운 객체를 만들어서
		// 가리키는 대상이 다름
		
		System.out.println("-----문자열 값 동등 확인-----"); 
		System.out.println(a.equals("He" + llo)); // true
		//[.equals] a 와 ("He" + llo)의 문자열 값이 같은지를 묻는 매소드
		//관계 연산자가 아닌 .equals 사용!!
	}
}