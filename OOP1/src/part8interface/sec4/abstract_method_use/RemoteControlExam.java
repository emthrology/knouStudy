package part8interface.sec4.abstract_method_use;

import part8interface.interface_intro.interface_definition.RemoteControlable;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControlable rc = null;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();

	}

}
