package part7.sec3.parent_constructor_call;

public class StuRun {

	public static void main(String[] args) {
		Student s = new Student("아무개", "111111-1111111",1);
		System.out.println(s.name);
		System.out.println(s.ssn);
		System.out.println(s.stuNo);
	}

}
