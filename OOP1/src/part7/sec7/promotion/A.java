package part7.sec7.promotion;

public class A {
	/*
	 * 부모클래스변수 = 자식클래스타입; -->이 떄 자동 타입변환이 일어난다
	 * 이 떄 부모클래스변수는 자식 클래스타입을 참조한다
	 * 상속계층에서 어떤 상위 타입이라도 자동 타입 변환이 일어날 수 있다
	 * 
	 * 자동변횐된 이후의 효과 : 부모클래스에 선언된 필드와 메소드만 접근 가능하다(자식에서 새로 만든 메소드는 자동타입변환된 부모클래스로는 사용 불가능하다)
	 * 메소드가 제정의되었다면 자식 클래스의 재정의된 메소드가 호출된다!
	 * 
	 */
	
	public void method1() {
		System.out.println("m1 called");
	}
	public void method2() {
		System.out.println("m2 called");
	}
}
