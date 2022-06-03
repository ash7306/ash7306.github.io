import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TestDateMethods {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate nowPlusOne = now.plusDays(1);
		Calendar now1 = Calendar.getInstance();
		
		// 내일의 날짜 객체
		LocalDate result = now.plusDays(1);		
		System.out.println(result);
				
		LocalDate tomorrow = LocalDate.of(2022, 6, 4);
		System.out.println(tomorrow.equals(nowPlusOne));
		
		System.out.println("------------------------------");
				
		now1.add(Calendar.DAY_OF_MONTH, 1);
		
		Date date = now1.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");	// mm분 MM월
		String result1 = dateFormat.format(date);
		System.out.println(result1);
		
		

		

	}
}
