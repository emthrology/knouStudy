package part8interface.sec5.casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkfare(); // The method checkfare() is undefined for the type Vehicle
		//버스 클래스가 갖고 있는 고유의 메소드를 실행하기 위해 새로운 버스변수를 인터페이스변수 vehicle을 버스로 강제형변환하 만들어준다
		//조건 : 인터페이스타입이 자동형변환된 상태여야 가능하다
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.chechfare();

	}

}
