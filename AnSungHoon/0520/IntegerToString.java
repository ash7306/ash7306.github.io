public class IntegerToString {
	public static void main(String[] args) {
		String strNum = String.valueOf(12345);
		System.out.println(strNum);
		
		int i = 4567;
		
		String strNum2 = "문자열" + i;// 아무것도 아닌""문자열에 int형을 앞에 붙여서 문자열로
		System.out.println(strNum2);
		System.out.println(strNum2.charAt(6));	//몇번째 '문자열'을 찾아오는 것
		
		
	}
}