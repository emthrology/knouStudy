package part9.OverrapingClass.sec3.outterclass_ref;

public class Outter {
//	중첩클래스에서 바깥클래스 참조 얻기 (안드로이드에서 주로 사용)
//	-->바깥클래스명.this.field 사용

	String field = "Outter-field";
	void method() {
		System.out.println("outter-method");
	}
	
	class Nested {
		String field = "Nested-fleid";
		void method() {
			System.out.println("nested-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
	
	
}
