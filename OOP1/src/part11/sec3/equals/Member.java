package part11.sec3.equals;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) { // equals()재정의 - 논리동등을 비교하기위함
		if(obj instanceof Member) { //만약 obj가 Member 의 인스턴스라면
			Member member = (Member)obj; //obj는 Member 타입으로 강제 형변환하고
			if(id.equals(member.id)) { //id가 member(원래 obj)와 비교했을 때 같다면
				return true;
			}
		}
		return false;
	}
}
