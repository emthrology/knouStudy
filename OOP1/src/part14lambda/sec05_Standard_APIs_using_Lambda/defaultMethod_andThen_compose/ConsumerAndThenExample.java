package part14lambda.sec05_Standard_APIs_using_Lambda.defaultMethod_andThen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	//consumer 의 디폴트 메소드 andThen()은 두 인터페이스의 호출 순서만 결정한다
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA : " + m.getName());
		};

		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB : " + m.getId());
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍씨","hong", null));
	}

}
