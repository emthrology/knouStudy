package part8interface.sec7.defautMethod_extends;

public interface ParentInterface {
	public void method1();
	public default void method2() { //public default는 접근제한자 2개가 붙은게 아니라 인터페이스 전용 구문이다
		System.out.println("ParentInterface-default method2()");
	}
}
