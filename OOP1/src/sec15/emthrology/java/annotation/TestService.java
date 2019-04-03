package sec15.emthrology.java.annotation;

public class TestService {
	
	@PrintAnnotation
	public void method1() {
		System.out.println("excecution 1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("excecution 2");
	}
	
	@PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("excecution 3");
	}
}
