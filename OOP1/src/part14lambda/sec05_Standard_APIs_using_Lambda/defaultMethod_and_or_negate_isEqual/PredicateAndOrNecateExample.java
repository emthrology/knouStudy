package part14lambda.sec05_Standard_APIs_using_Lambda.defaultMethod_and_or_negate_isEqual;

import java.util.function.IntPredicate;

public class PredicateAndOrNecateExample {

	public static void main(String[] args) {
		//2의 배수를 검사
		IntPredicate predicateA = a -> a%2 == 0; 
		// a%2가 0이면 true, 아니면 false return / 본문이 한 문장이고 return 뿐이면 중괄호와 return 생략 가능
		
		//3의 배수 검사
		IntPredicate predicateB = a -> a%3 == 0;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and()
		//(2의 배수 && 3의 배수) == 6의 배수
		int value = 30;
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(value);
		System.out.println(value + "는 6의 배수인가? :" + result);
		
		//or()
		//(2의 배수 || 3의 배수) == 그냥 그런거지 뭐..
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(value);
		System.out.println(value + "는 2의 배수이거나 3의 배수인가? :" + result);
		
		//negate()
		//(!2의 배수) == 홀수
		predicateAB = predicateA.negate();
		result = predicateAB.test(value);
		System.out.println(value + "는 홀수인가? :" + result);
	}

}
