package part8interface.sec4.static_method_use.copy;

import part8interface.interface_intro.interface_definition.RemoteControlable;

public class Audio implements RemoteControlable {
	//인터페이스를 활용한 또다른 객체
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Audio on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio off");
		
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
		System.out.println("Audio volulm : " + volume);
		
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio mute");
		}else {
			System.out.println("Audio unmute");
		}
		
	}
}
