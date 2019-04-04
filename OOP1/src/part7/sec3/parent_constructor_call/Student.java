package part7.sec3.parent_constructor_call;

public class Student extends People{
	public int stuNo;
	public Student(String name, String ssn,int stuNo) {
		super(name, ssn);//수퍼클래스에 디폴트가 없어서 명시적으로 만들어줘야한다
		this.stuNo = stuNo;
		System.out.println("자식 객체 생성 완료");
	}

}
