import java.io.StreamTokenizer;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple,banana,carrot/donut";
		StringBuilder sj = new StringBuilder(longLine);
		StringTokenizer st = new StringTokenizer(longLine, "./, ");
		//longLine에서 "./, "중 하나를 만날 떄 까지만 가져온다
		//그후 nextToken 호출하면  그제서야 가져온다		
		
		st.hasMoreTokens();
		System.out.println(st.hasMoreTokens());
		//st에 꺼내올꺼 있냐 (" "가 longLine에 있냐?)있으면 true 없으면 false
		
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());

//		","기준으로 문자열을 뽑아서 배열을 만들어줌
		String[] split = longLine.split(",");
		System.out.println(split[2]);	//두번째 인덱스 호출
//		split()은 기준을 StringTokenizer처럼 여러개 할 수 없다		

				
	}
}
