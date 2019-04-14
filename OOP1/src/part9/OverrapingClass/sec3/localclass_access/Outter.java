package part9.OverrapingClass.sec3.localclass_access;

public class Outter {
//	자바 8에서 로컬클래스를 사용하면
//	매개변수와 로컬 변수가 지정하지 않더라도 자동으로 final특성을 가진다 
//	매개변수가 로컬클래스의 '필드'로서 인식된다
	
	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner {
			void metod() {
				//final선언하면 로컬클래스에서 컴파일러가 변수 생성하는 위치
//				int arg = 10;
//				int localVariable = 1;
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		class Inner {
			//final선언 하지 않으면 로컬클래스에서 컴파일러가 변수 생성하는 위치
//			int arg = 10;
//			int localVariable = 1;
			void metod() {
				int result = arg + localVariable;
			}
		}
	}
}
