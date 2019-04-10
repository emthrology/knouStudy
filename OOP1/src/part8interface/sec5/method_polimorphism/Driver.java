package part8interface.sec5.method_polimorphism;

public class Driver {
	public void drive(Vehicle vehicle) { // 매개변수로 인터페이스 타입을 지정하고 vo들을 만들어 놓은 다음 필요할 때vo들을 집어넣는거시다
		vehicle.run();
		
	}
}
