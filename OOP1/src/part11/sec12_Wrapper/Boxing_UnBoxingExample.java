package part11.sec12_Wrapper;

public class Boxing_UnBoxingExample {

	public static void main(String[] args) {
		//boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = Integer.valueOf("100");
		
		//unboxing
		int value1 = obj1.intValue();
		int value2 = obj1.intValue();
		int value3 = obj1.intValue();
		int value4 = obj1.intValue();

		
	}	
 
}
