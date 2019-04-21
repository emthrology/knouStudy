package part11.sec07_String.method;

public class StringToLowerUpperCaseExmple {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		//대소문자 상관없이 문자열이 일치하는지 확인하고싶다 혹은 Y, y에 상관없이 'yes'라는 의미만 받고싶다
		System.out.println(str1.toUpperCase().equals(str2.toUpperCase()));//true
		
		System.out.println(str1.equalsIgnoreCase(str2));//대소문자 무시하고 비교하는 메소드가 있네

	}

}
