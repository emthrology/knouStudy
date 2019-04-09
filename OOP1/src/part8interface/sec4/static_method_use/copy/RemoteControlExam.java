package part8interface.sec4.static_method_use.copy;

import part8interface.interface_intro.interface_definition.RemoteControlable;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControlable.changeBattery(); //인터페이스의 정적메소드는 인터페이스에 직접접근 가능
	}

}
