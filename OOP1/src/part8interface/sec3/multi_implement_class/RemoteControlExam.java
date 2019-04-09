package part8interface.sec3.multi_implement_class;

public class RemoteControlExam {

	public static void main(String[] args) {
		SmartTelvision tv = new SmartTelvision();
		
		RemoteControlable rc = tv;
		Searchable sb = tv;
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		sb.search("http://www.naver.com");

	}

}
