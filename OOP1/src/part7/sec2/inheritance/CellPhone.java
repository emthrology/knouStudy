package part7.sec2.inheritance;

public class CellPhone {
	String model;
	String color;
	public void powerOn() {
		System.out.println("power ON");
	}
	
	public void powerOff() {
		System.out.println("power OFF");
	}
	
	public void bell() {
		System.out.println("Ring");
	}
	
	public void sendVoice(String message) {
		System.out.println("ME : " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("THE OTHER PERSON : " + message);
	}
	
	public void hangUp() {
		System.out.println("HANG UP");
	}
}
