package emthrology.java.oop.sec07_constructor_call;

public class Ex {
	String company = "hyundai";
	String model;
	String color;
	int maxSpeed;
	
	Ex() {
		
	}
	//값을 지정한 필드가 아닌 이상 다른 값들은 기본값으로 초기회된다
	
	Ex(String model) {
//		this.model = model;
//		this.color = null;
//		this.maxSpeed = 0;
		this(model,null,0);
	}
	
	Ex(String model, String color) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 0;
		this(model,color,0);
	}
	
	Ex(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	//비슷한 생성자로 중복발생 --> this() 다른 생성자를 가리키는 예약어 사용 (여기서는 매개변수 3개짜리 생성자를 가리킨다)
	//조건 : this()는 다른 실행문보다 먼저 생성자 생성 시 작성되어야 한다

	
}
