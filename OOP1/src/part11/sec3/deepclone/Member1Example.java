package part11.sec3.deepclone;

public class Member1Example {

	public static void main(String[] args) {
		Member1 original1 = new Member1("홍길동", 25, new int[] {90,80}, new Car("소나타"));
		
		Member1 cloned = original1.getMember();
//		cloned.scores[0] = 100;
//		정리 :객체의 setter를 쓰고 싶으면 그 안에 객체의 생성자를 집어넣어
		cloned.setScores(new int[] {100, 80});
		cloned.setCar(new Car("그랜저"));
//		참조자료형을 끼고있는 객체를 얕은 복사하면-참조자료형의 경우-자료의 필드값만 복사하고 실제 참조 객체의 주소는 공유한다.(같은 객체 쓴다)
//		깊은 복사를 해야 새로운 참조자료 객체를 생성해 거기에 필드값을 복사해 넣는다. 이 경우 복사한 참조객체의 값을 수정 및 삭제하더라도 
//		원본객체에는 영향이 미치지 않는다.
		
		System.out.println("원본 객체 필드값");
		System.out.println("name : " + original1.getName());
		System.out.println("age : " + original1.getAge());
		System.out.print("scores : {");
		for(int i = 0;i<original1.getScores().length;i++) {
			System.out.print(original1.getScores()[i]);
			System.out.print((i==(original1.getScores().length -1))?"":",");
		}
		System.out.println("}");
		System.out.println("car : " + original1.getCar().getModel() + "\n");

		
		System.out.println("깊은 복제된 객체 필드값");
		System.out.println("name : " + cloned.getName());
		System.out.println("age : " + cloned.getAge());
		System.out.print("scores : {");
		for(int i = 0;i<cloned.getScores().length;i++) {
			System.out.print(cloned.getScores()[i]);
			System.out.print((i==(cloned.getScores().length -1))?"":",");
		}
		System.out.println("}");
		System.out.println("car : " + cloned.getCar().getModel());

	}
 
}
