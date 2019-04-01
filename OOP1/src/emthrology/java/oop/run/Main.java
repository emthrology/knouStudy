package emthrology.java.oop.run;

import emthrology.java.oop.func.Student;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1변수는 Student 객체를 참조");
		
		Student s2 = new Student();
		System.out.println("s2변수는 새로 생성된 Student 객체를 참조");

	}

}
