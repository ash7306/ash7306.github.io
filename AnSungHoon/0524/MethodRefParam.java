public class MethodRefParam {
	// 메소드 참조형 매개변수
	public static String concat(String left, String right) {
								// left - Hello를 참조하는 화살표를 복사
		return left + right;	// right - world를 참조하는 화살표를 복사	
	}

	public static void main(String[] args) {
		String h = "Hello ";	// h는 Hello 라는 문자를 참조하는 변수
		String w = "world";		// w는 world 라는 문자를 참조하는 변수
		String result = concat(h, w);
		
		System.out.println(result);
	}
}