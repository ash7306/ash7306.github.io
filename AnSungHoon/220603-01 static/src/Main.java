import java.time.LocalDate;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		// get 안에 숫자 정수를 넣게끔 되어있음
		System.out.println(now.get(1));
		System.out.println(now.get(2) + 1);
		System.out.println(now.get(5));
		System.out.println(now.get(7));
		// 번호를 넣으면 그에 맞는 숫자를 출력함
		// *1은 년도 *(2)+1는 월 *5는 일 *7은 요일
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1);	//1월을 0으로 만들어놈 그래서 +1 해줘야함
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));	//일요일이1 ~~ 토요일이7
		// 1,2,5,7라는 수에대해 상수로 만들어놓음
		System.out.println("상수값 확인: " + Calendar.DAY_OF_MONTH);
		
		LocalDate now1 = LocalDate.now();
		System.out.println(now1.getYear());
		System.out.println(now1.getMonth());
		System.out.println(now1.getMonthValue());
		System.out.println(now1.getDayOfMonth());
		System.out.println(now1.getDayOfWeek());
		System.out.println(now1.getDayOfWeek().getValue());	// 월요일은 1 일요일은 7
		
	}

}
