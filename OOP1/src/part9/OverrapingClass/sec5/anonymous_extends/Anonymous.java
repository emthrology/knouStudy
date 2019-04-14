package part9.OverrapingClass.sec5.anonymous_extends;

public class Anonymous {
	Person field = new Person() {
		String studentNo;
		
		void work() {
			System.out.println("출근할거야");
		}
		
		@Override
		void wake() {
			System.out.println("6시에는 일어납니다");
			work();
		};
	};
	
	void method1() {
		Person localVar = new Person() {
			String studentNo;
			
			void walk() {
				System.out.println("산책할거야");
			}
			
			@Override
			void wake() {
				System.out.println("7시에는 일어납니다");
				walk();
			};

		};
		localVar.wake();
	}
	
	void mehtod2(Person person) {
		person.wake();
	}
}
