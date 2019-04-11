package part8interface.sec7.defautMethod_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		//그냥 상속
		ChildInterface ci1 = new ChildInterface() {
			
			@Override
			public void method1() {
				System.out.println("ci1-method1()");
				
			}
			
			@Override
			public void method3() {
				System.out.println("ci1-mehtod3()");
				
			}
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		System.out.println();
		//디폴트 내용을 재정의
		ChildInterface2 ci2 = new ChildInterface2() {
			
			@Override
			public void method1() {
				System.out.println("ci2-method2()");
				
			}
		};
		ci2.method2();
		
		System.out.println();
		//디폴트 메소드를 다시 추상메소드로
		ChildInterfece3 ci3 = new ChildInterfece3() {
			
			@Override
			public void method1() {
				System.out.println("ci3-method3()");
				
			}
			
			@Override
			public void method2() {
				System.out.println("ci3-method2()");
				
			}
		};
		
		ci3.method1();
		ci3.method2();
		

	}

}
