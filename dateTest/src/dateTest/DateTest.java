package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일\nHH : mm");
		
		System.out.println(simpleDateFormat.format(date));
		
		try {
			simpleDateFormat.parse("1994년 겨울");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
