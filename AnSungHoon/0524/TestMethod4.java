public class TestMethod4 {
	public static boolean between(int num) {
	// 점수 하나를 전달받아 1 ~ 100 사이의 수이면 true을 반환하고,
	// 그렇지 않으면 false를 반환하는 메소드 작성
		if (num >= 1 && num <= 100) {
			return true;
		} else {
			return false;
		}
	}	
	public static void main(String[] args) {
		System.out.println(between(7));
	}
}