package part11.sec16_java_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTImeCompareExample {

	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.now();
		System.out.println("시작일 : " + startDateTime);
		
		LocalDateTime endDateTime = startDateTime
			.plusYears(1)
			.plusMonths(3)
			.with(TemporalAdjusters.lastDayOfMonth())
			.withHour(23)
			.withMinute(59)
			.withSecond(59);
		System.out.println("목표일 : " + endDateTime + "\n");
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행중입니다." + "\n");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다." + "\n");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료했습니다." + "\n");
		}
		
		System.out.print("[종료까지 남은 시간] : ");
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		System.out.println(remainYear + "년 또는 " + remainMonth + "개월 또는 " + remainDay + "일\n");
		
		//위의 수식은 아래처럼 써도 같은 결과값이 나온다
		System.out.print("[종료까지 남은 시간] : ");
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		System.out.println(remainYear + "년 또는 " + remainMonth + "개월 또는 " + remainDay + "일");
		
		//ChronoUnit의 .between()메소드와 Period.between()의 비교
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.print("\nperiod로 계산한 남은 기간 : " + period.getYears() + "년 ");
		System.out.print(period.getMonths() + "개월 ");
		System.out.println(period.getDays() + "일 ");
		
		Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		System.out.println(duration.toHours());
		System.out.println(duration.toMinutes());
		System.out.println(duration.getSeconds());
	}

}
