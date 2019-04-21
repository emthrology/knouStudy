package part11.sec16_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "년 ";
		strDateTime += now.getMonthValue() + "월 ";//value안붙이면 January같은게 리턴
		strDateTime += now.getDayOfMonth() + "일 ";
		strDateTime += now.getDayOfWeek() +  " ";
		strDateTime += now.getHour() + "시 ";
		strDateTime += now.getMinute() + "분 ";
		strDateTime += now.getSecond() + "초 ";
		strDateTime += now.getNano() + "나노초";
		System.out.println(strDateTime);
		
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("올해는 윤년");
		}else {
			System.out.println("올해는 평년");
		}
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("세계협정시 : " + utcDateTime);
		
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울타임존 : " + seoulDateTime);
		
		ZoneId seoulZoneId = seoulDateTime.getZone();
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("서울타임존 스펠링 : " + seoulZoneId + "\n" + "서울 존 오프셋 : " + seoulZoneOffset);
	}

}
