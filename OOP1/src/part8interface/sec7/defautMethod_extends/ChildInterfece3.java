package part8interface.sec7.defautMethod_extends;

public interface ChildInterfece3 extends ParentInterface {
	@Override //부모인터페이스의 디폴트 메소드를 다시 추상메소드로 만들어도 오버라이드 어노테이션에 걸리지 않는다
	void method2();
}
