package emthrology.java.oop.sec07_field_initialize;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	
		//this는 객체 자신의 참조로서 자신의 번지를 가지고 있다
		//필드임을 명시하기 위해 this.를 붙인다
		//cf)블럭 내부에서는 매개변수가 필드보다 우선순위가 더 높다
		
	}
}
