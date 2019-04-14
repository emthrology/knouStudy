package part9.OverrapingClass.sec3.field_method_access;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 20;
			method2();
		}
		
	}
	//인스턴스 멤버 클래스 내에서는 인스턴스 멤버,인스턴스 메소드, 정적 필드, 정적 메소드 모두 사용 가능하다
	
	static class C {
		void method() {
//			field1 = 10; //field1은 class A의 인스턴스멤버이므로 생성할 때 반드시 A 가 필요하다
//			method1();
			
			field2 = 20;
			method2();
		}
	}
	//정적 멤버 클래스 내에서는 정적 필드와 메소드만 사용 가능하다
}
