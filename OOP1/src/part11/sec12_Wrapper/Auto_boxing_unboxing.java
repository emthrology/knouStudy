package part11.sec12_Wrapper;

public class Auto_boxing_unboxing {

	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println("value :" + obj.intValue());

		int value = obj;
		System.out.println("value :" + value);
		
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
