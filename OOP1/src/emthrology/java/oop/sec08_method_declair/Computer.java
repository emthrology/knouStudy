package emthrology.java.oop.sec08_method_declair;

public class Computer {
	public int sum1(int[] values) {
		int sum = 0;
		for(int i = 0;i<values.length;i++) {
			sum+= values[i];
		}//for ends
		return sum;
	}
	
	int sum2(int ... values) {//위의 다른 버전
		int sum = 0;
		for(int i = 0;i<values.length;i++) {
			sum+= values[i];
		}//for ends
		return sum;
	}

}

