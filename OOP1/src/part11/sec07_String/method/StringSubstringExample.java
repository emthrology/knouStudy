package part11.sec07_String.method;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880000-1222333";
		
		String firstNum = ssn.substring(0,6);
		String secNum = ssn.substring(7);
		System.out.println(firstNum + secNum);

	}

}
