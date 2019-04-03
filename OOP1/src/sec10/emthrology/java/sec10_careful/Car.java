package sec10.emthrology.java.sec10_careful;

public class Car {
	int speed;
	void run() {
		System.out.println(speed + "으로 달린다");
		
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.speed = 60;
		car.run();
	}
}
