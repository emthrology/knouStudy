package emthrology.java.oop.sec9_instance_member;

public class Car {
	//인스턴스 필드
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10;i<=50;i+=10) {
			this.setSpeed(i);//인스턴스 메소드
			System.out.println(this.model + "가 달린다");
		}
	}
}
