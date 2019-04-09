package part8interface.sec4.default_method_use;

import part8interface.interface_intro.interface_definition.RemoteControlable;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControlable rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		//RemoteControlable.setMute(true);와 같이는 사용 할 수 없다
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);//인터페이스의 디폴트메소드를 오디오가 재정의하였고, 인터페이스타입으로 호출되었지만 오디오의 메소드처럼 작동한다
		
	}

}
