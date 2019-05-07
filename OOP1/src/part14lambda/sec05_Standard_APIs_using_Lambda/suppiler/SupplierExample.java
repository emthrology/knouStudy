package part14lambda.sec05_Standard_APIs_using_Lambda.suppiler;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int)(Math.random()*6) + 1;
			
			return num;
		};
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수 : " + num);

	}

}
