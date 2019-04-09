package part8interface.sec3.interface_implementation;

import part8interface.interface_intro.interface_definition.RemoteControlable;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControlable rc;
//		rc = new RemoteCOntrolable(); 이거 안됨
//		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();//구현한 객체의 실제 메소드가 실행
		rc.turnOff();
	}

}
