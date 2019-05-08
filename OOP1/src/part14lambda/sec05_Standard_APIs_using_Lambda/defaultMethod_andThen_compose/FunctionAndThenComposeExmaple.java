package part14lambda.sec05_Standard_APIs_using_Lambda.defaultMethod_andThen_compose;

import java.util.function.Function;

public class FunctionAndThenComposeExmaple {
	//Function의 andThen()
	//Member,Address를 사용하는 인터페이스functionA의 결과값 new Address()를 
	//Address,String을 사용하는 functionB의 매개값으로 전달하고 String을 얻음
	//Function의 compoese() : 순서가 반대로 오면됨
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
		
		functionAB = functionA.andThen(functionB);

		String city = functionAB.apply(new Member("홍씨", "hong", new Address("한국","seoul")));
		System.out.println("거주도시 : " + city);
		
		functionAB = functionB.compose(functionA);
		
		String city1 = functionAB.apply(new Member("홍씨", "hong", new Address("한국","seoul")));
		System.out.println("거주도시 : " + city1);
	}

}
