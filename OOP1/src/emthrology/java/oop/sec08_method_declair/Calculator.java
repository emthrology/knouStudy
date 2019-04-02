package emthrology.java.oop.sec08_method_declair;

public class Calculator {
	void powerOn() {
		System.out.println("전원 켠다");
	}
	
	int plus(int x , int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x,int y) {
		double result = (double)x/y;
		return result;
	}
	
}
