package webapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy");
		//DateTimeFormatter formatter =DateTimeFormatter.RFC_1123_DATE_TIME;
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		//String date=new Date().toString();
		ZonedDateTime date=ZonedDateTime.now();
		System.out.println(date.format(formatter));
	}

}
