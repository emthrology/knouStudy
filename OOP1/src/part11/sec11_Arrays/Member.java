package part11.sec11_Arrays;

public class Member implements Comparable<Member>{
	String name;

	public Member(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);//String 클래스의 String끼리 비교하는 메소드
	}
	
	@Override
	public String toString() {
		return name + " ";
	}
	
}
