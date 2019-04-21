package part11.sec16_java_time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("current : " + now);
		LocalDateTime targetDateTime = null;
		
		//직접변경
		targetDateTime = now
			.withYear(2029)
			.withMonth(12)
			.withDayOfMonth(5)
			.withHour(13)
			.withMinute(30)
			.withSecond(20);
		System.out.println("직접 변경 : " + targetDateTime);
		
		//상대변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번 해의 첫 일 : " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("이번 해의 마지막 일 : " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("다음 해의 첫 일 : " + targetDateTime);
		
		//월 상대변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫 일 : " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번 달의 마지막 일 : " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음 달의 첫 일 : " + targetDateTime);
		
		//요일 상대변경
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // 이번 달 첫번 째 월요일
		System.out.println("이번 달의 첫 월요일 : " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달의 마지막 월요일 : " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("오늘로부터 돌아오는 월요일 : " + targetDateTime);
		
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("저번주 월요일 : " + targetDateTime);
	}

}
