package part7.sec7.field_array_polimorphism;

public class KeumhoTire extends Tire {

	public KeumhoTire(String location, int maxRottion) {
		super(location, maxRottion);
		
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation <maxRotation) {
			System.out.println(maxRotation-accumulatedRotation+"회 더 구를수있어 금호타이어");
			return true;
		}else {
			System.out.println("금호타이어punked");
			return false;
		}
		
	}
	
	
}
