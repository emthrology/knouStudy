package part11.sec14_date_calander.calander;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int f = now.get(Calendar.DATE);//위와 같다
		int hour = now.get(Calendar.HOUR);
		int amPm = now.get(Calendar.AM_PM);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int g = now.get(Calendar.DAY_OF_WEEK);
		
		String strAmPm;
		if(amPm==Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		String week = null;
		switch(g) { 
		case 1:week = "일";//Calendar.SUNDAY == 1;
			break;
		case 2: week = "월";
			break;
		case 3: week = "화";
			break;
		case 4: week = "수";
			break;
		case 5: week = "목";
			break;
		case 6: week = "금";
			break;
		case 7: week = "토";
		}
		System.out.println(year + "년 " + month + "월 " + day + "일 " + week + "요일 "
		+ strAmPm + hour + "시 " + minute + "분 " + second + "초");
	}

}
