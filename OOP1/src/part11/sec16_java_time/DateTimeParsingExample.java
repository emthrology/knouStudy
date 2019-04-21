package part11.sec16_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {

	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		//'Parsing' : 문자열이 어떤 형태로 들어오든 간에 '정해진 형식'으로 정제하는 작업-->문자열이 적힌 방식은 무시됨
		
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);
		
		
	}

}
