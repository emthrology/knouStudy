package emthrology.java.oop.sec8_return;

public class CarRun {

	public static void main(String[] args) {
		Car car = new Car();
		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		if(gasState) {
			System.out.println("출발");
			car.run();
		}
		
		if(car.isLeftGas()) {
			System.out.println("gas 남아있음");
		}else {
			System.out.println("gas 없음, 추가 주입 필요");
		}

	}

}
