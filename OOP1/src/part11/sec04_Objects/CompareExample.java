package part11.sec04_Objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(3);
		
		int result = Objects.compare(s1,s2, new StudentComparator());
		System.out.println(result);
		
		result = Objects.compare(s2,s3, new StudentComparator());
		System.out.println(result);
		
		result = Objects.compare(s3,s2, new StudentComparator());
		System.out.println(result);
	}
	
	static class Student {
		int sno;
		Student(int sno) {
			this.sno = sno;
		}
	}
	
	//여기가 핵심
	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student a, Student b) {
			/*
			if(a.sno<b.sno) return -1;
			else if(a.sno == b.sno) return 0;
			else return 1;
			//한줄짜리 코드에는 중괄호가 필요없다
			*/
			return Integer.compare(a.sno, b.sno);
		}
		
		
	}

}
