package part14lambda.sec03._return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x,y) -> {
			int result = x+y;
			return result;
		};
		System.out.println(fi.method(2, 3));
		
		fi = (x,y) -> {return x+y;};
		System.out.println(fi.method(4, 5));
		
		fi = (x,y) ->  x+y;
		System.out.println(fi.method(6, 7));
		
		fi = (x,y) -> sum(x,y);
		System.out.println(fi.method(8, 9));

	}
	
	public static int sum(int x, int y) {
		return x+y;
	}

}
