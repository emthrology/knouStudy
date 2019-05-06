package part14lambda.sec04.localVariables;

public class UsingLocalVariables {
	void method(int arg) {
		int localVar = 40;
		
		//arg = 1; // Local variable arg defined in an enclosing scope must be final or effectively final
		//매개변수는 그대로 가져다 쓰는 변수이지, 멋대로 바꿔쓰는 것이 아니라 final속성이 붙는 것이야
		
		//또한 로컬변수는 로컬클래스가 해당 변수를 사용하면 final속성을 가진다
		MyFunctionalInterface fi = () -> {
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar);
		};
		fi.method();
  	}
}
