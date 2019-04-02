package emthrology.java.oop.sec8_method_call;

public class Car {
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("시동 건다");
	
	}
	
	void run() {
		for(int i = 10;i<=50;i+=10 ) {
			speed = i;
			System.out.println("달린다 (시속:" + speed + "km/h)");
		}
	}
}
