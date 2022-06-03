import java.time.format.TextStyle;
import java.time.*;
import java.util.Locale;

public class Calendar {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();	// 오늘 날짜				
		LocalDate start = YearMonth.now().atDay(1);		// 1일의 날짜
		DayOfWeek dayOfWeek = date.getDayOfWeek();		// 오늘의 요일을 영어로
		DayOfWeek dayOfWeek1 = start.getDayOfWeek();	// 1일의 요일을 영어로
		int dayOfWeekNumber = dayOfWeek1.getValue();	// 1일의 요일을 정수로
		LocalDate end = YearMonth.now().atEndOfMonth();	// 마지막일의 날짜
		
		int last = end.lengthOfMonth();	// 마지막일을 정수로
		int first = dayOfWeekNumber;	// 첫째 일을 정수로 
		String t = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.KOREAN);
		// 오늘 요일을 한글자 한글로
				
		System.out.println(start);		// 2022-06-01
		System.out.println(dayOfWeek1);	// wednesday
		System.out.println(dayOfWeekNumber);// 3
		System.out.println(first);		// 3
		System.out.println(end);		// 2022-06-30
		System.out.println(last);		// 30

		System.out.println("오늘:" + date + " " + t);
		System.out.println("일   월   화   수   목   금   토");

		for (int j = 0; j < first; j++)
			System.out.printf("%s", "   ");
		for (int i = 1; i <= last ; i++) {
			if ((i + first) % 7 == 0) {
				System.out.printf("%02d ", i);
				System.out.println();
			} else {
				System.out.printf("%02d ", i);
			}
		}
	}

}
