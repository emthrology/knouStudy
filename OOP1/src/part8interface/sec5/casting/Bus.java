package part8interface.sec5.casting;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달린다");
		
	}
	
	public void chechfare() {
		System.out.println("표검사 합니다");
	}
	
}
