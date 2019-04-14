package part9.OverrapingClass.sec2_nestedclass_object;

public class A {
	A() {
		System.out.println("A객체 생성");
		
		B b = new B();
		b.field1 = 3;
		b.method1();
		
	}
	
	class B {
		int field1;
		//static int field2; //정적 필드와 메소드는 선언 불가능
		B() {
			System.out.println("B객체가 생성됨");
		}
		void method1() {
			
		}
	}
	
	static class C{
		int field1;
		static int field2;
		C() {
			System.out.println("C객체가 생성됨");
		}
		void method2() {}
		static void method3() {}
		
	}
	
	void method() {
		class D {
			int field1;
			D() {
				System.out.println("D객체가 생성됨");
			}
			void method1() {}
			
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

}
