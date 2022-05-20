public class StringMethods {
	public static void main(String[] args) {
		String hello = "hello World";
		
		int index = hello.indexOf("l");	//문자열에 index를 찾는 매소드
		System.out.println(index);		
		
		int notFound = hello.indexOf("a");
		System.out.println(notFound);
		
		int index2 = hello.lastIndexOf("l"); //반대로 오른쪽에서 찾는 
		System.out.println(index2);

		int index3 = hello.indexOf("l", 6); //6번째 부터 "l"을 찾음
		System.out.println(index3);		
	}
}