package part8interface.sec3.multi_implement_class;

import part8interface.interface_intro.interface_definition.RemoteControlable;

public class SmartTelvision implements part8interface.sec3.multi_implement_class.RemoteControlable, Searchable {
	/*
	 * 다중인터페이스 구현 클래스 
	 * public class 구현클래스 implements 인터페이스 A, 인터페이스 B { 
	 * 	//A에 선언된 모든 추상메소드의 실체메소드 구현 
	 * 	//B에 선언된 모든 추상메소드의 실체메소드 구현 
	 * }
	 */

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV on");
		
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
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");

	}


}
