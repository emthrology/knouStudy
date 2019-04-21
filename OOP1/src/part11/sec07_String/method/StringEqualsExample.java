package part11.sec07_String.method;

public class StringEqualsExample {

	public static void main(String[] args) {
		String ssn = "001111-2113345";
		
		char sex = ssn.charAt(7);
		switch(sex) {
			case '1':
			case '3':
				System.out.println("male");
				break;
			case '2':
			case '4':
				System.out.println("female");
				break;
		}

	}

}
