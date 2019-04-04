package part7.sec3.parent_constructor_call;

public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		super();//object()상속
		this.name = name;
		this.ssn = ssn;
		System.out.println("부모객체 먼저 생성 완료");
	}

	
	
}
