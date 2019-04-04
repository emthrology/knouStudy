package part7.sec4.overriding;

public class Com extends Calc{

	@Override
	double areaCircle(double r) {
		
		return 3.14592*Math.pow(r, 2);
		
	}
	
}
