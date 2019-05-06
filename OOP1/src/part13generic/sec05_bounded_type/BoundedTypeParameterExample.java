package part13generic.sec05_bounded_type;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		int result1 = Util.compare(3.14, 2.718);
		System.out.println(result1);
		
		//int result2 = Util.compare("3.14", "2.718"); // compile error occurred
	}

}
