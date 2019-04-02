package emthrology.java.oop.sec08_method_declair;

public class ComputerRun {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		int[] values = {1,2,3};
		int result1 = myCom.sum1(values);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3});
		System.out.println("result2 : " + result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);//배열길이 지정에 구속받지 않는다
		
	}

}
