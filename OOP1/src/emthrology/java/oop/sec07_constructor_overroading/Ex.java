package emthrology.java.oop.sec07_constructor_overroading;

public class Ex {
	String company = "hyundai";
	String model;
	String color;
	int maxSpeed;
	
	Ex() {
		
	}
	//값을 지정한 필드가 아닌 이상 다른 값들은 기본값으로 초기회된다
	
	Ex(String model) {
		this.model = model;
	
	}
	
	Ex(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Ex(int maxSpeed, String color) {
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
	//..매개변수 자료형의 순서가 달라져도 오버로딩이

	
}
