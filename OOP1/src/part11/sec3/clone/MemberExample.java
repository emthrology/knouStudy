package part11.sec3.clone;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("blue", "홍길동", "1234", 25, true);
		
		Member cloned = original.getMember();
		cloned.setPassword("67890");//원시자료형은 객체 개념이 없기 때문에 막바로 복사된다(얕고 깊고가 없음 무조건 따로 만들어짐)
		
		System.out.println("원 객체의 필드값");
		System.out.println("id  : " + original.getId());
		System.out.println("name : " + original.getName());
		System.out.println("password : " + original.getPassword());
		System.out.println("age : " + original.getAge());
		System.out.println("adult : " + original.isAdult() + "\n");
		System.out.println("복제된 객체의 필드값");
		System.out.println("id  : " + cloned.getId());
		System.out.println("name : " + cloned.getName());
		System.out.println("password : " + cloned.getPassword());
		System.out.println("age : " + cloned.getAge());
		System.out.println("adult : " + cloned.isAdult());

	}

}
