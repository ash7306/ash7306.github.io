import java.awt.PageAttributes.OriginType;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("원본");
		//다른문자열을 붙이고 싶을때
//		sb.append(",One=");
//		sb.append(1);
//		sb.append(",Color=");
//		sb.append(255.0);
		
		sb.append(",One=").append(1).append(",Color=").append(255.0);
		//append는 작업 후에 자기 자신의 참조를 반환한다.		
		sb.setCharAt(0, 'Q');	//입력인덱스한 곳을 교체
		sb.insert(0, "시작");		//입력인덱스에 추가
//		sb.replace(start, end, str);	
		
		String result = sb.toString();
		
		System.out.println(result);
		System.out.println(sb.reverse());
		
		StringBuffer sbuffer;
		//흐름을 따라가는 쓰레드
		//큰 흐름들을 문제가 생기기 않게 작업들이 있다보니
		//StringBuilder보다 느림
		
		
		
		
		
//		String str = "원본 문자열";		
//		String other = "다른 문자열";
//		String origin = "원본 문자열";
//		
//		String concat = str + "원본 문자열";
//		
//		System.out.println(concat);
//		System.out.println(str == origin);
//		System.out.println("원본 문자열다른 문자열" == concat);
//		// false : 값은 같으나, 참조가 다름!!  
//		// 문자열 하나를 표현하기 위해서 '새 인스턴스를 만들수 밖에 없다'
		
		
	}
}
