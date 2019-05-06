package part14lambda.sec04.field;

public class UsingThisExample {

	public static void main(String[] args) {
		UsingThis us = new UsingThis();
		//중첩클래스 호출
		UsingThis.Inner inner = us.new Inner();
		inner.innerMethod();

	}

}
