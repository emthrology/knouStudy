package emthrology.java.oop.sec8_method_call;

public class CarRun {

	public static void main(String[] args) {
		Car car = new Car();
		car.keyTurnOn();
		car.run();
		
		int currentSpeed = car.getSpeed();
		System.out.println("현재속도 :" + currentSpeed + "km/h");

	}

}
