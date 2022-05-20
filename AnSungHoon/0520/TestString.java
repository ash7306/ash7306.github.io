public class TestString {
	public static void main(String[] args){
		// 참조형은 '대문자'로 시작
		// class로 불러옴(class는 첫글자 대문자로)
		String str;
		str = "Hello World";
		
		System.out.println(str);
		
		String s2 = "다음 문자열";
		System.out.println(s2);
		
		String concat = str + "\n" + s2;
		String concat2 = str + "\n" + 3.0 + true + s2;				
		System.out.println(concat);
		System.out.println(concat2);
	}
}