package part7.sec6.protected1;

public class C {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
		//같은 패키지, 문제없음
	}
}
