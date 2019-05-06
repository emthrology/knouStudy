package part14lambda.sec03.no_arguments_no_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		//MyFunctionalInterface의 익명구현객체를 람다식으로 표현
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		//실행문이 하나일 경우 중괄호 생략 가능
		fi = () -> System.out.println("method call2");
		fi.method();
		
		//중요 : 익명구현객체이기 때문에 새로이 객체를 명명할 필요가 없다(함수처럼 중괄호안에 새로운 함수식을 만든거라고 생각하면 이해가 쉬울듯?)
		
		//cf)람다식을 사용하지 않은 익명구현객체
		fi = new MyFunctionalInterface() {
			
			@Override
			public void method() {
				System.out.println("method call3");
				
			}
		};
		fi.method();

	}

}
