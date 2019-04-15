package part11.sec3.toString;

public class SmartPhone {
	public String company;
	public String os;
	
	public SmartPhone(String compnay, String os) {
		this.company = compnay;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + " " + os;
	}
}
