public class LoopFor1 {
	public static void main(String[] args) {
		// "반복"이라는 문자열 5번 출력하기
		for (int i = 0; i < 5; i++) {
			System.out.println("출력");
		}
		
		// 제일 세개의 입력값중에 제일 앞부분 '선언식'(for문 안에서 초기화를 선언하는 부분)
		// 중간의 '조건식'(true,false 두가지 값) ,ture일 때 밑의 {}중괄호 안으로 들어감
		// 그후 '}'끝을 만나면 세개중 제일 마지막 부분 "증강식" 으로 돌아감 그 후에 다시
		// '조건식부분'으로 돌아감, 계속 반복하다가 '조건식부분'에서 false가 되면 for문이 종료됨
		// '조건식'부분이 비어 있으면 'true'라고 인식한다
		System.out.println("----------------");
		
		for (int x = 1; x <= 10; x++) {
			System.out.println(x);
		}
		
		// for (시작;끝;얼만큼늘어날지;)
		for (int x = 21; x <= 30; x += 3) {
			System.out.println(x);
		}
		// 역순
		for (int x = 30; x >= 20; x--) {
			System.out.println(x);
		}
	}	
}
