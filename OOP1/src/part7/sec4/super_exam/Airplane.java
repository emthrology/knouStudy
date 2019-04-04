package part7.sec4.super_exam;

public class Airplane {
	private String speed;
	public Airplane() {
		
	}
	
	public Airplane(String speed) {
		this.speed = speed;
	}
	
	public String getSpeed() {
		return speed;
	}
	
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public void land() {
		System.out.println("landing");
	}
	
	public void fly() {
		System.out.println("flying");
	}
	
	public void takeOff() {
		System.out.println("takeOff");
	}

	@Override
	public String toString() {
		
		return speed;
	}
	
	
}
