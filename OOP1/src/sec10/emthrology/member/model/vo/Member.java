package sec10.emthrology.member.model.vo;

import java.sql.Date;

public class Member {
	private String	memberId;
	private String	memberPwd;
	private String	memberName;
	private String	gender;
	private int		age;
	private String	email;
	private String	phone;
	private String	address;
	private String	hobby;
	private Date	enrollDate;
	
	public Member() {
		super();
		
	}
	
	
	public Member(String memberId, String memberPwd, String memverName, String gender, int age, String email,
			String phone, String address, String hobby, Date enrollDate) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memverName;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
		this.enrollDate = enrollDate;
	}
	
	
	public Member(String memberId, String memberPwd, String email, String phone, String address, String hobby) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
	}


	public String getMemberId() {
		return memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String getHobby() {
		return hobby;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public void setMemberName(String memverName) {
		this.memberName = memverName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}


	@Override
	public String toString() {
		return memberId+"\t"+memberPwd+"\t"+memberName+"\t"+gender+"\t"
				+age+"\t"+email+"\t"+phone+"\t"+address+"\t"+hobby+"\t"+enrollDate;
	}
	
	
	
}
