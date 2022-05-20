public class CharTypes {
	public static void main(String[] args) {
		char a = 'a';		// ""문자열과 다르게 문자형은''쓴다 (호따움표)
		char b = 'b';		// 문자형은 문자 하나만 씀
		char ga = '가';
		char num1 = '1';
		
		char what = 65;		// 유니코드 표현법에 따라서 숫자로 문자로 표현가능
		System.out.println(what); // 'A'
		
		char linefeed = '\n'; 	// \n 두글자지만 한글자로 취급하기 위해서 char 사용
		char tab = '\t';		// 실제 tap 들여쓰기 기능
		System.out.print("qwe" + linefeed);
		System.out.print(tab + "다음줄인가?");
		
		System.out.println("\"");	// 백슬러쉬를 앞에 써주면 따움표 사용 가능
		System.out.println('\'');
		System.out.println(a);
		System.out.println(b + a);// 연산하면 숫자로 표현됨
		System.out.println(ga);
		System.out.println(num1);
	}
}