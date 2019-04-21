package part11.sec16_java_time;

import java.time.LocalDateTime;

public class DateTImeOperationExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("current : " + now);
		
		//간편하게 입력하는 방법
		LocalDateTime targetDateTime = now
			.plusYears(1)
			.plusMonths(2)
			.plusDays(3)
			.plusHours(4)
			.minusMinutes(5)
			.plusSeconds(6);
	
		System.out.println("연산후 : " + targetDateTime);

		
	}

}
