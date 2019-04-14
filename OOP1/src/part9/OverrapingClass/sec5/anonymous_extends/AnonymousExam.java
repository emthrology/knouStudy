package part9.OverrapingClass.sec5.anonymous_extends;

public class AnonymousExam {

	public static void main(String[] args) {
		Anonymous anno = new Anonymous();
		
		anno.field.wake();
		
		anno.method1();
		
		anno.mehtod2(new Person() {
			String studentNo;
			
			void study() {
				System.out.println("공부할거야");
			}
			
			@Override
			void wake() {
				System.out.println("10시에는 일어납니다");
				study();
			}
		});

	}

} 
