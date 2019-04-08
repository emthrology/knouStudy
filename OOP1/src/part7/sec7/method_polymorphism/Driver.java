package part7.sec7.method_polymorphism;

public class Driver {
	public void drive(Vehicle vehicle) {//매개변수가 클래스 타입일 경우 해당 클래스를 상속하는 자식객체들이 얼마든지 들어갈 수 있다
		vehicle.run();
	}
}
