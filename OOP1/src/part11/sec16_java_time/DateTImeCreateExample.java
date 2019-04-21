package part11.sec16_java_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTImeCreateExample {

	public static void main(String[] args) throws InterruptedException {
		//날짜 얻기
		LocalDate currDate = LocalDate.now();
		System.out.println("current date : " + currDate);
		
		LocalDate targetDate = LocalDate.of(2029, 5, 10);
		System.out.println(targetDate);
		
		//시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("current time : " + currTime);
		
		LocalTime targetTime = LocalTime.of(6,30,0,0);
		System.out.println(targetTime);
		
		//날짜와 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("current dateTime : " + currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2029,5,10,6,30,0,0);
		System.out.println(targetDateTime);
		
		//협정 세계시와 타임존
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("UTC :" + utcDateTime);
		
		ZonedDateTime newYorkDateTIme = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("현재 뉴욕시간 : " + newYorkDateTIme);
		//전체 타임존 아이디 구하기
//		String[] availableIds = TimeZone.getAvailableIDs();
//		for(String zondId : availableIds) {
//			System.out.println(zondId);
//		}
		
		//특정시점의 타임스탬프 얻기
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		Instant instant2 = Instant.now();
		
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1 is earlier");
		} else if(instant1.isAfter(instant2)) {
			System.out.println("instant2 is earlier");
		} else {
			System.out.println("both instants are pointing out same time stamp");
		}
		
		System.out.println("difference of time(nanosec) : " + instant1.until(instant2, ChronoUnit.NANOS));

		
	}

}
