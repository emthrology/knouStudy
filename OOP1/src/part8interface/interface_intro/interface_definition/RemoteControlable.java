package part8interface.interface_intro.interface_definition;

public interface RemoteControlable {
	// 개발코드와 객체가 서로 통신하는 접점이다
	// 개발코드는 객체의 내부구조를 알 필요가 없고 인터페이스의 메소드만 알고 있으면 된다
	/*
	 * 인터페이스의 역할 개발코드가 객체에 종속되지 않게 하여 객체를 교체할 수 있도록 하는 역할을 한다 개발코드 변경 없이 리턴값 또는
	 * 실행내용이 다양해 질 수 있다.
	 * 
	 * 인터페이스 선언 인터페이스 이름 : 자바 식별자 작성 규칙에 따라 작성, ~able로 짓는것이 보통 소스파일 생성 : 인터페이스 이름과
	 * 대소문자가 동일한 소스 파일을 생성 인터페이스 구성 맴버 :상수, 추상메소드, 디폴트 메소드 ,정적 메소드 인터페이스의 상수 :
	 * 인터페이스에 선언된 필드는 모두 public static final의 특징을 가지므로 따로 적을 필요는 없다 추상메소드 : public
	 * abstract를 생략하더라도 자동적으로 컴파일과정에서 붙게 된다 인터페이스를 통해 호출된 메소드는 최종적으로 객체에서 실행된다. 디폴트
	 * 메소드 : 실행블록을 가지고있는 인터페이스의 메소드, default를 반드시 붙여야함. 정적 메소드 : static을 붙이면됨, 나머지는
	 * 디폴트와 비슷함
	 * 
	 */
	/*
	 * 구현객체와 구현 클래스
	 * 	인터페이스의 추상메소드에 대한 실체 메소드를 가진 객체 : 구현객체
	 * 	구현객체를 생성하는 클래스 : 구현 클래스
	 * 
	 * 구현클래스 선언 :implements $interface_name
	 * 
	 * 추상메소드의 실체 메소드를 작성하는 방법
	 * 	메소드의 선언부가 정확히 일치하여야 한다
	 * 	인터페이스의 모든 추상 메소드를 재정의하는 실체메소드를 작성해야 한다
	 * 	인터페이스의 모든 메소드는 public 을갖기 때문에 그보다 더 낮아질 수 없다
	 * 	검사 : @Override 어노테이션을 활용해 컴파일러체크를 하도록 한다
	 * 
	 * 인터페이스를 사용한 경우
	 * 	인터페이스 변수 = 구현객체;
	 * 	인터페이스 변수;
	 * 	변수 = 구현객체;
	 * 	e.g.
	 * 	RemoteControlable rc;
	 * 	rc = new Television();
	 *  rc = new Audio();
	 */
	/*
	 * 인터페이스에 구현객체를 대입하는 방법 -->sec4에 있음
	 * 	인터페이스의 구현객체는 필드, 생성자, 메소드, 로컬변수, 메소드의 매개변수로 사용 가능하다
	 * 
	 * 디폴트 메소드 사용 
	 * 	구현객체가 인터페이스에 대입되어야 사용 가능, 모든 객체가 가지고 있는 기본 메소드로 사용된다 -> 필요에 따라 구현
	 * 	클래스가 디폴트 메소드를 재정의해서 사용할 수 있다
	 * 
	 * 정적 메소드 사용 
	 * 	인터페이스로 바로 호출 가능 RemoteControlable.~~();가능
	 * 
	 */

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// interface의 상수는 static block에서 초기화 불가능하다
	public abstract void turnOn();

	void turnOff();

	void setVolume(int volume);

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리중");
		} else {
			System.out.println("무음 해제");
		}
	}

	static void changeBattery() {
		System.out.println("건전지 교환");
	}
}
