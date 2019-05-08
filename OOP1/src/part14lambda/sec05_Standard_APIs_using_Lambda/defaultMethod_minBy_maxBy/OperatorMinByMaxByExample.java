package part14lambda.sec05_Standard_APIs_using_Lambda.defaultMethod_minBy_maxBy;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator = BinaryOperator.minBy((f1,f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기",6000), new Fruit("바나나", 3000));
		System.out.println(fruit.name);
		
		binaryOperator = BinaryOperator.maxBy((f1,f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기",6000), new Fruit("바나나", 3000));
		System.out.println(fruit.name);
		

	}

}
