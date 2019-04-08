package part7.sec7.field_array_polimorphism;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRottion) {
		super(location, maxRottion);
		
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation <maxRotation) {
			System.out.println(maxRotation-accumulatedRotation+"회 더 구를수있어 한국타이어");
			return true;
		}else {
			System.out.println("한국타이어punked");
			return false;
		}
		
	}
	
	
}
