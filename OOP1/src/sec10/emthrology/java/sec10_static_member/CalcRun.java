package sec10.emthrology.java.sec10_static_member;

public class CalcRun {

	public static void main(String[] args) {
		double result1 = 10*10*Calculator.PI;
		double result2 = 10*10*Math.PI;
		
		int result3 = Calculator.plus(10, 5);
		System.out.println(result1 + " / " + result2 +  " / " + result3);
		//console : 314.1592 / 314.1592653589793 / 15
		
	}

}
