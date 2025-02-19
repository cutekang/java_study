package dateTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTest2 {
	public static void main(String[] args) {
//		싱글턴 패턴
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		
		System.out.println(dateFormat.format(calendar.getTime()));
		
		LocalDate now = LocalDate.now();
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy")));
//		System.out.println(LocalDate.parse("1900",DateTimeFormatter.ofPattern("yyyy")));
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2.format(DateTimeFormatter.ofPattern("HH:mm")));
	}
}
