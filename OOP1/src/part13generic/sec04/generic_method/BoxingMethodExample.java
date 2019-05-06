package part13generic.sec04.generic_method;

public class BoxingMethodExample {

	public static void main(String[] args) {
		//제네릭 메소드(예제 Util()) 사용법 1 - 구체적 타입 파라미터 지정
		Box<Integer> box1 = Util.<Integer>boxing(100); // <Integer> Box<Integer> part13generic.sec04_generic_method.Util.boxing(Integer t)
		int value = box1.get();
		System.out.println(value);
		
		//제네릭 메소드(예제 Util()) 사용법 2 - 매개변수로부터 타입 파라미터 유추
		Box<String> box2 = Util.boxing("홍길동");
		String str = box2.get();
		System.out.println(str);
		
	}

}
