package part11.sec07_String.method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "Java Programming";
		
		int location = subject.indexOf("Programming");
		System.out.println(location); //5('J''a''v''a'' ''P...)
		
		if(subject.indexOf("Java") != -1) {
			System.out.println("relative to Java");
		} else {
			System.out.println("none on your business");
		}

	}

}
