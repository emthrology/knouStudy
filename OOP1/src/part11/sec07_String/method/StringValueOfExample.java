package part11.sec07_String.method;

public class StringValueOfExample {

	public static void main(String[] args) {
		String str1 = "123";
		Integer int1 = Integer.parseInt(str1);
		String str2 = String.valueOf(int1);
		System.out.println(str1==str2);
		

	}

}
