package part8interface.sec6.interface_extends;

public class Example {

	public static void main(String[] args) {
//		인터페이스 간에도 상속이 가능
//			public interface 하위 인터페이스 extends 상위 인터페이스1, 상위 인터페이스 2 {...}
//			//상위 인터페이스 간에 hierarchy가 없을 수도 있다
//
//		하위 인터페이스를 구현하는 클래스는 아래 추상 메소드를 모두 재정의해야 한다
//			하위 인터페이스의 추상메소드
//			상위 인터1 의 추상메소드
//			상위 인터 2의 추상메소드
//
//		인터페이스 자동 타입 변환
//			해당 타입의 인터페이스에 선언된(또는 인터페이스가 상속받은) 메소드만 호출할 수 있다
		ImplementationC impl = new ImplementationC();
		
		IntercaceA ia = impl;
		ia.methodA();
//		ia.methodB();//The method methodB() is undefined for the type IntercaceA
		
		IntercaceB ib = impl;
		ib.methodB();
		
		IntercaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
