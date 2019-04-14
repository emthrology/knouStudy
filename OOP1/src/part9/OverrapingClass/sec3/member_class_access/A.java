package part9.OverrapingClass.sec3.member_class_access;

public class A {
	class B {}
	static class C {}
	
	
	//인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void mehtod1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적 필드
//	static B field3 = new B(); //B는 반드시 A 객체가 생성되어야 사용 가능하다
	static C field4 = new C();
	
	//정적 메소드
	static void mehtod2() {
//		B var1 = new B(); //No enclosing instance of type A is accessible. Must qualify the allocation with an enclosing instance of type A (e.g. x.new A() where x is an instance of A).
		
		C var2 = new C();
	}
	
}
