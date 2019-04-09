package part8interface.sec3.interface_implementation;

import part8interface.interface_intro.interface_definition.RemoteControlable;

public class Television implements RemoteControlable {
	/*
	 * 구현객체와 구현 클래스
	 * 	인터페이스의 추상메소드에 대한 실체 메소드를 가진 객체 : 구현객체
	 * 	구현객체를 생성하는 클래스 : 구현 클래스
	 * 
	 * 구현클래스 선언 :implements $interface_name
	 * 
	 * 추상메소드의 실체 메소드를 작성하는 방법
	 * 	메소드의 선언부가 정확히 일치하여야 한다
	 * 	인터페이스의 모든 추상 메소드를 재정의하는 실체메소드를 작성해야 한다
	 * 	인터페이스의 모든 메소드는 public 을갖기 때문에 그보다 더 낮아질 수 없다
	 * 	검사 : @Override 어노테이션을 활용해 컴파일러체크를 하도록 한다
	 * 
	 * 인터페이스를 사용한 경우
	 * 	인터페이스 변수 = 구현객체;
	 * 	인터페이스 변수;
	 * 	변수 = 구현객체;
	 * 	e.g.
	 * 	RemoteControlable rc;
	 * 	rc = new Television();
	 *  rc = new Audio();
	 */
	private int volume;
	//이클립스로 자동생성
	@Override
	public void turnOn() {
		System.out.println("TV on"); //본체 구현
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV off");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControlable.MAX_VOLUME) {
			this.volume = RemoteControlable.MAX_VOLUME;
		}else if(volume<RemoteControlable.MIN_VOLUME) {
			this.volume = RemoteControlable.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("TV volulm : " + volume);
		
	}
}
