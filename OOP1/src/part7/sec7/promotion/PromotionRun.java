package part7.sec7.promotion;

public class PromotionRun {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b2 = e; //Type mismatch: cannot convert from E to B
//		C c2 = d; //Type mismatch: cannot convert from C to D
		
		A a = b;
		a.method1(); //b의 메소드를 검색하고 없으면 수퍼클래스의 메소드를 호출한다
		a.method2(); //b의 메소드를 호출한다
//		a.method3(); // The method method3() is undefined for the type A

	}

}
