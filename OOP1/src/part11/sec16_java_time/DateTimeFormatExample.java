package part11.sec16_java_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);

	}

}
