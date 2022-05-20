// 제어문
// 모든 프로그램들은 흐름이 있다
public class TestIf{
	public static void main(String[] args) {
		// 조건을 이야기하는 if 중괄호 안에
		// 조건식(boolean의 값을 가짐)		
		//if ( 조건식(논리값) ) {
			// 조건식이 참이면
			// 안의 문장들을 실행함
			// 중괄호의 끝을 만나면 다시 정상적으로 흐름으로 돌아감
			// 조건식이 거짓이면 안의 문장들을 건너띄고
			// 중괄호 끝의 정상적으로 흐름으로 돌아감
		//}
	
		boolean condition = false;
		if (condition) {
			System.out.println("조건문 블록 안입니다.");
		}			//if가 참일떄 실행되는 문장을 'then절' 이라고 한다.
		System.out.println("프로그램 종료");
		//
	}
}