import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		// 생성자를 직접 호출하는게 아니라 매소드를 통해서 
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");	
		String result = dateFormat.format(date);
		System.out.println(result);
		
		
//		Calendar cal = Calendar.getInstance(); // 객체라는건 new가 필요한데 getInstance() 이미 안에 new가 잇음
//		Date date = cal.getTime();
//		
//		// 클래스 객체 
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");	// mm분 MM월
//		String result = dateFormat.format(date);
//		System.out.println(result);
//		
	}

}
