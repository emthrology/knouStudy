package part7.sec6.protected2;

import part7.sec6.protected1.A;

public class B extends A{
	public B() {
		super();
		this.field = "value";
		this.method();
	}
	public void method() {
//		A a = new A(); //다른 패키지 : The constructor A() is not visible
	}
}
