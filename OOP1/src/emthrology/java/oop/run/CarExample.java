package emthrology.java.oop.run;

import emthrology.java.oop.field_dclairation.Car;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); //생성자 호출
		System.out.println("Maker : " + myCar.company);
		System.out.println("model : " + myCar.model);
		System.out.println("color : "+myCar.color);
		System.out.println("MaxSpeed : "+myCar.maxSpeed);
		System.out.println("CurrentSpeed : "+myCar.speed);//default value of int : 0
		// 다른패키지에서 작성해서 car의 필드를 public으로 바꿔야했음
		// MVC 디자인패턴으로 하면 vo의 필드는 private으로 두고, getter를 만들어야함
		myCar.speed = 60;
		System.out.println("CurrentSpeed : "+myCar.speed);

	}

}
