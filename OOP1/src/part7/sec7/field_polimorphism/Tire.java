package part7.sec7.field_polimorphism;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tire(String location, int maxRottion) {
		this.location = location;
		this.maxRotation = maxRottion;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation <maxRotation) {
			System.out.println(maxRotation-accumulatedRotation+"회 더 구를수있어");
			return true;
		}else {
			System.out.println("punked");
			return false;
		}
		
	}
}
