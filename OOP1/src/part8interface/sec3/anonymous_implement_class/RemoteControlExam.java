package part8interface.sec3.anonymous_implement_class;

public class RemoteControlExam {

	public static void main(String[] args) {
		/*
		 * 익명구현객체 
		 * 명시적인 구현 클래스 작성을 생략하고 바로 구현 객체를 얻는 방법 이름이 없는 구현클래스 선언과 동시에 객채를 생성한다
		 * 
		 * e.g. 
		 * 인터페이스 i = new 인터페이스() { 
		 * 	//인터페이스에 선언된 추상 메소드의 실체 메소드 선언 
		 * 	}; 
		 * 인터페이스의 추상 메소드들을 모두 재정의하는 실체메소드가 있어야 한다
		 * 추가적으로 필드와 메소드를 선언할 수 있지만 익명객체안에서만 사용가능, 인터페이스변수로 접근할 수 없다
		 * 
		 * 주로 사용되는곳 : UI프로그래밍(Java Fx, Swing, Andriod등)에서 이벤트를 처리하기 위해 주로 사용 
		 * 임시작업 스레드를 만들기 위해 사용 
		 * 람다식은 내부적으로 익명 구현 객체를 사용
		 * 
		 * 익명 구현 객체도 클래스(바이트코드)파일을 가지고 있다 클래스$번호.class 파일명으로 생성된다
		 */
		RemoteControlable rc = new RemoteControlable() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		//익명구현객체의 바이트 코드 파일 생성 : RemoteControlExam$1.class

	}

}
