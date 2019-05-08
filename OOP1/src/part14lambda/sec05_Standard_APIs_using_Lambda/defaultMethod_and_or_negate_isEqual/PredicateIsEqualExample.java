package part14lambda.sec05_Standard_APIs_using_Lambda.defaultMethod_and_or_negate_isEqual;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

	//컬렉션에서 문자열을 찾을 때 혹은 필터링할 때 쓴다
	public static void main(String[] args) {
		Predicate<String> predicate;
		
		predicate = Predicate.isEqual(null);
		System.out.println("null, null : " + predicate.test(null));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, null : " + predicate.test(null));
		
		predicate = Predicate.isEqual(null);
		System.out.println("null, Java8 : " + predicate.test("Java8"));
		
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, Java8 : " + predicate.test("Java8"));
	}

}
