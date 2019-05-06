package part14lambda.sec04.field;

public class UsingThis {
	public int field = 10;
	
	
	class Inner {
		int field = 20;
		
		void innerMethod() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField : " + UsingThis.this.field); // 중첩클래스에서 중첩클래스 바깥의 멤버를 호출할 때
				System.out.println("innerField : " + this.field); // 중첩클래스의 멤버를 호출할 때
			};
			fi.method();
		}
	}
}
