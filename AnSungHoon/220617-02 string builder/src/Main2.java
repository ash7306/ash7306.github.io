import java.util.StringJoiner;

public class Main2 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",", "[", "]");
									//합쳐진것을 ,로 구분하고 처음엔 [, 마지막엔 ]로 할래
		sj.add("1");
		sj.add("2");
		sj.add("3");
//		sj.add 값들을 합치는데 사이사이에 ","를 넣어서
		
		String result = sj.toString();
		
		System.out.println(sj);	//String.valuOf 가 생략되어 있음
		System.out.println(result);
		
		
		
	}
}
