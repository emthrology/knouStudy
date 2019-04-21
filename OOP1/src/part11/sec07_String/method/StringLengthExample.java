package part11.sec07_String.method;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "1122331223344";
		System.out.println(ssn.length());
		
		if(ssn.length()==13) {
			System.out.println("authentic ssn");
		} else {
			System.out.println("fake ssn");
		}

	}

}
