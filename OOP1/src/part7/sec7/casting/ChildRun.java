package part7.sec7.casting;

public class ChildRun {
	public static void main(String[] args) {
		/*
		 * 강제타입변환 : 부모타입을 자식타입으로 강제변환 
		 * 자식클래스 변수 = (자식클래스)부모클래스타입;
		 * 조건 : 자식타입이 부모타입으로 자동변환된 이후, 다시 자식타입으로 변환할 때에만 유효하다
		 * 
		 * 필요성 : 자식타입이 부모타입으로 자동변환되면, 부모타입에 선언된 필드와 메소드만 사용가능한데
		 * 자식타입에 선언된 필드와 메소드를 다시 사용해야한다면 강제 형변환이 필요
		 */
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data2";
		//parent.method3();
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
		
		/*
		 * 주의 :먼저 자식타입인지 확인 후 강제 케스팅을 해야 한다
		 * boolean result = 좌항(객체) instnceof 우항(타입)
		 * instanceof 좌측이 우측타입으로 만들어졌다면 true
		 * if(parent instanceof Child) {
		 * 		Child child = (Child) parent;
		 * 이런 식으로 쓴다
		 */
		
		
	}
		 
}
