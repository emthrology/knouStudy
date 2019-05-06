package part13generic.sec06_generic_wildcard;

public class Course<T>{
	private String name;
	private T[] students; // 객체를 정하기 나름 - 수강생 타겟을 직장인, 학생, 일반인 이렇게 나누는 것처럼
	
	//capacity 는 T[]의 크기를 지정하려고
	public Course(String name, int capacity) {
		this.name = name;
		//students = new T[capacity]; // Cannot create a generic array of T
		students = (T[]) new Object[capacity];
	}
	
	public String getName() {return name;}
	public T[] getStudents() {return students;}
	
	//배열의 비어있는 부분을 찾아 채우는 메소드
	public void add(T t) {
		for(int i = 0; i<students.length; i++) {
			if(students[i]== null) {
				students[i] = t;
				break;
			}
		}//for ends
	}
}
