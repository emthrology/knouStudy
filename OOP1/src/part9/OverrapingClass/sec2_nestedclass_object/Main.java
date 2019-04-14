package part9.OverrapingClass.sec2_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B(); //인스턴스 멤버 클래스를 다른 클래스에서 호출하는 경우 호출법
							//순서 : 인스턴스멤버 클래스의 상위 클래스 객체를 만든 후, 그 참조변수를 통해 인스턴스메소드를 호출한다
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C(); // 정적 멤버 클래스의 호출법
		
		c.field1 = 3;
		A.C.field2 =3;
		c.method2();
		A.C.method3();
		
		a.method();//실행클래스에서는 이렇게 간접적으로만 로컬클래스를 사용한다
	}
//	console:
//	A객체 생성
//	B객체가 생성됨
//	B객체가 생성됨
//	C객체가 생성됨
//	D객체가 생성됨


}
