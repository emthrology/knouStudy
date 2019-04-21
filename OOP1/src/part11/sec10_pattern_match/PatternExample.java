package part11.sec10_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regex = "(02|010)-\\d{3,4}-\\d{4}";
		//02 또는 010이 와야하고, 두번째 자리는 3 또는 4자리의 숫자가, 세번째 자리에는 4자리의 숫자가 와야한다
		
		String data = "019-1232-4567";//정규식과 일치하지 않음
		boolean result = Pattern.matches(regex, data);
		if(result) {
			System.out.println("정규식과 일치함");
		} else {
			System.out.println("정규식과 일치하지 않음");
		}
		
		regex = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; // 이메일 정규표현식
		data = "emthrology@gmail.com";
		result = Pattern.matches(regex, data);
		if(result) {
			System.out.println("정규식과 일치함");
		} else {
			System.out.println("정규식과 일치하지 않음");
		}

	}
	

}
