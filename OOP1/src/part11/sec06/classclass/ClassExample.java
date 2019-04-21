package part11.sec06.classclass;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();//클래스 갖고오기
		System.out.println(clazz1.getName());//패키지.클래스이름 호출 
		System.out.println(clazz1.getSimpleName());//패키지 뺸 클래스이름만 호출
		System.out.println(clazz1.getPackage().getName());//패키지만 호출
		System.out.println();
		
		//try안에서 생성된 인스턴스 변수는 구문 나오면 사라지니까 구문 밖에서 선언해줘서 따로 저장하자  
		Class clazz2 = null;
		try {
			clazz2 = Class.forName("part11.sec06.classclass.Car");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(clazz2.getName());//패키지.클래스이름 호출 
		System.out.println(clazz2.getSimpleName());//패키지 뺸 클래스이름만 호출
		System.out.println(clazz2.getPackage().getName());//패키지만 호출
	}
}
