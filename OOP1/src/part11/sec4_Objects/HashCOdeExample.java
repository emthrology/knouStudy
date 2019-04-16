package part11.sec4_Objects;

import java.util.Objects;

public class HashCOdeExample {

	public static void main(String[] args) {
		

	}
	
	static class Student{
		int sno;
		String name;
		
		public Student(int sno, String name) {
			super();
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(sno,name); // 둘 다 같아야 할 때 사용
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student s = (Student) obj;
				if(s.sno==this.sno) {
					if(s.name.equals(this.name)) {
						return true;
					}
				}
			}
			return false;
		}
	}

}
