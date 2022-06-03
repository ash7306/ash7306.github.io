import java.util.Calendar;
public class Main {
	public static void main(String[] args) {
		// 02%d
		// java.util.Calender
		// 1.8 이후로 java.time.LocalDate
		// 같은 날짜를 구하는 코드지만 표현 방법이 다름
		
		// Calendar today = new Calendar; (X)생성자호출 안됨. public 하지 않음
		Calendar today = Calendar.getInstance();	
		// 메소드가 있는데 그안에서 new를 쓰고 있어서 참조를 하고 있음
		// 스태틱한 메소드라 이름을 만들어서 사용 / getInstance는 객체가 아님 클래스 이름으로 사용
		
		
	}
}
