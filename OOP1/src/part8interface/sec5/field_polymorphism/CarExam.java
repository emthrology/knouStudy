package part8interface.sec5.field_polymorphism;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
//		car.run();
		
		car.tires[0] = new KeumhoTire();
		car.tires[1] = new KeumhoTire();
		
		car.run();

	}

}
