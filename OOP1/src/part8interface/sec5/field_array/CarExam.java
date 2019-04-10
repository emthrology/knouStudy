package part8interface.sec5.field_array;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
//		car.run();
		
		car.frontLeftTire = new KeumhoTire();
		car.frontRightTire = new KeumhoTire();
		
		car.run();

	}

}
