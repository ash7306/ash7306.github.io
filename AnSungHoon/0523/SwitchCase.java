public class SwitchCase {
	public static void main(String[] args) {
		int i = 3;
		
		// 스위치문은 (정수) 가 온다.
		// 이 정수 값에 따라 해당 case를 찾고 그 밑으로 쭈욱 실행 시킨다.
		// 그래서 break 문 사용하면 if, else if 문처럼 사용 가능
		switch (i) {
			case 1:
			System.out.println("일");
			break;
			case 2:
			System.out.println("이");
			break;
			case 3:
			System.out.println("삼");
			break;
			default:
			System.out.println("일이삼 아님");
			// default는 switch에서 해당하는 정수값을 찾을수 없을 때
		}
	}
}