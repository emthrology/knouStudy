package emthrology.java.oop.sec8_return;

public class exam {

	public static void main (String args[]) {

	    System.out.println("isOdd1(5) " + isOdd1(5));
	    System.out.println("isOdd1(-5) " + isOdd1(-5));
	    
	    System.out.println(-5/2);

	    System.out.println("isOdd2(5) " + isOdd2(5));
	    System.out.println("isOdd2(-5) " + isOdd2(-5));

	    System.out.println("isOdd3(5) " + isOdd3(5));
	    System.out.println("isOdd3(-5) " + isOdd3(-5));

	    }

	    public static boolean isOdd1(int i) {

	        return i % 2 == 1;  // wrong
	                            // (a / b) * b + (a % b) == a
	    }


	    public static boolean isOdd2(int i) {

	        return i % 2 != 0;
	    }


	    public static boolean isOdd3(int i) {

	        return (i % 1) != 0;
	    }

}
