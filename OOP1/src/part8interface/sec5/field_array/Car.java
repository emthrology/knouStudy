package part8interface.sec5.field_array;

public class Car {
	/*
	 * 다형성을 구현하는 기술 : 상속 또는 인터페이스의 자동 타입 변환(promotion) 오버라이딩 
	 * 
	 * 다형성의 효과 
	 * 	다양한 실행 결과를 얻을 수있다 
	 * 	객체를 부품화시킬 수 있어 유지보수가 용이하다
	 * 
	 * 인터페이스는 매개변수 타입으로 자주 등장한다 
	 * 	메소드 호출시 매개값으로 여러가지 종류의 구현객체를 대입할 수 있어 메소드 실행 결과가 다양하게 나온다
	 *  방식 : 인터페이스를 활용하여 vo를 생성하고 컨트롤러나 서비스 등에 vo를 대입하는 대신 인터페이스 인스턴스를 쓴다
	 * 
	 * 자동타입변환(promotion) 구문 : 인터페이스 변수 = 구현객체;
	 * 
	 * 필드의 다형성 
	 * 	자동차클래스를 설계할 때, 타이어라는인터페이스를 선언하고 roll이라는 추상메소드가 포함되었다 
	 * 	구현객체로 한국타이어를 만들어주는데, 인터페이스 타이어를 구현하고, roll을 오버라이딩하여 구체적 내용을채운다 
	 * 	클래스 car에서 쓰일 변수를 자동타입변환을 활용하여 인터페이스 타이어 형식의 한국타이어 객체를 만든다.
	 * 	클래스 car의 메소드 run에서 객체마다 지정된 메소드 roll을 불러온다
	 * 	이 roll은 인터페이스의 것이 아닌 한국타이어의 것
	 * 실헹클래스 단계에서의 쓰임
	 *	이후 앞바퀴를 다른 객체를 자동타입변환을 이용해 새로 선언하면 앞바퀴부분은 새로운 객체의 rule을 따를 것이다
	 */
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire rearLeftTire = new HankookTire();
	Tire rearRightTire = new HankookTire();

	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		rearLeftTire.roll();
		rearRightTire.roll();
	}

}
