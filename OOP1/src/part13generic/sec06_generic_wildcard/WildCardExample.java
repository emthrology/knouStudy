package part13generic.sec06_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
	//와일드카드를 사용한 제네릭 메소드
	//1.제한을 두지 않은 경우
	public static void resisterCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	//2.상위타입 제한을 둔 경우
	public static void resisterCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	
	//3.하위타입 제한을 둔 경우
	public static void resisterCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		//다양한 Course객체들 만들기(Person이 최상위, Student와 Worker가 Person상속, HighSchoolStudent가 Student상속)
		Course<Person> personCourse = new Course<>("일반인과정",5);
		personCourse.add(new Person("일반인1"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인과정",5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<>("학생과정",5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighSchoolStudent("고등학생")); // student를 상속해서 가능
		
		Course<HighSchoolStudent> hStudentCourse = new Course<>("고등학생과정",5);
		hStudentCourse.add(new HighSchoolStudent("고등학생"));
		
		
		//Course 객체들을 와일드카드 제네릭 메소드에 대입하기
		//1.제한을 두지 않은 경우 - 모두 다 가능함
		System.out.println("[일반인과정 목록]");
		resisterCourse(personCourse);
		resisterCourse(workerCourse);
		resisterCourse(studentCourse);
		resisterCourse(hStudentCourse);
		System.out.println();
		
		//2.상위타입 제한을 둔 경우 - Student와 그를 상속하는 클래스(HighSchoolStudent)만 사용가능해진다
		System.out.println("[학생과정 목록]");
		//resisterCourseStudent(personCourse); // compile error occurred
		//resisterCourseStudent(workerCourse); // compile error occurred
		resisterCourseStudent(studentCourse);
		resisterCourseStudent(hStudentCourse);
		System.out.println();
		
		//3.하위타입 제한을 둔 경우 - Worker와 그가 상속하는 클래스(Person)만 사용가능해진다
		System.out.println("[직장인과정 목록]");
		resisterCourseWorker(personCourse);
		resisterCourseWorker(workerCourse);
		//resisterCourseWorker(studentCourse);  // compile error occurred
		//resisterCourseWorker(hStudentCourse); // compile error occurred

	}

}
