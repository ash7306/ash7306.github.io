// 컵사이즈 알려주기
// 사용자의 정수를 입력받아서
// 200이상이면 large
// 100이상 ~ 200미만 medium
// 100미만 small

public class TestElseIf {
	public static void main(String[] args) {
		int cup = 150;
		
		String size;
		if (cup > 200) {
			size = "large";
			// 반대상황 하나가 아니라 조건이 더 있을 때 else if 사용
		} else if (cup >= 100) {
			size = "medium";		
		} else if {
			size = "small";
			// 마지막엔 else
		}	
		System.out.println(size);
	}		
}