public class Main3 {
	public static void main(String[] args) {
		// 실수 1.02, 0.03, 4.0
		double d1 = 1.02;
		double d2 = 0.03;
		double d3 = 4.0;
		
		double[] aBox = { 1.02, 0.03, 4.0 };
		// []안에 길이값을 적으면 컴파일에러 ex) [3] { 1.02, 0.03, 4.0 };
	
		for (int i = 0; i < aBox.length; i++ ) {
			System.out.println(aBox[i]);
		}
	}
}
