package part8interface.sec5.instanceof_operator;

public class Driver {
	public void drive(Vehicle vehicle) { // 매개변수로 인터페이스 타입을 지정하고 vo들을 만들어 놓은 다음 필요할 때vo들을 집어넣는거시다
		if(vehicle instanceof Bus) { //진짜로 강제변환하려는 인터페이스가 구현객체를 참조하는지 알아보는 과정
			Bus bus = (Bus) vehicle;
			bus.chechfare();
		}
		vehicle.run();
		
		
		
		
	}
}
