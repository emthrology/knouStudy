package part13generic.sec02.none_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.set("ABC"); // String이 Object타입으로 자동 형변환
		String str = (String)box.get(); // 부모타입은 자식타입으로 변환 안되니까 강제로 해줘야함
		System.out.println(str);
		
		box.set(100);
		int num = (Integer)box.get();
		
		//새로운 객체 Apple() 생성후 Box()에 입력
		box.set(new Apple()); //Apple()의 상위객체인 Object로 형변환되어 저장됨
		Apple apple = (Apple)box.get();
		@SuppressWarnings("unchecked")
		Class<Apple> appleClass = (Class<Apple>) apple.getClass();
		System.out.println(appleClass);
	}

}
