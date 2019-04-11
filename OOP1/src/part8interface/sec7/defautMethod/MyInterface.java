package part8interface.sec7.defautMethod;

public interface MyInterface {
	public void method1();
	
	default void method2() {
		System.out.println("MyInterface-defaultmethod2()실행");
	}
}
