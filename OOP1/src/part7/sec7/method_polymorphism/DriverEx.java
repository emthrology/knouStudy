package part7.sec7.method_polymorphism;

public class DriverEx {

	public static void main(String[] args) {
		Driver d = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		d.drive(bus);//Vehicle의 run() 대신 자식객체가 오버라이딩한 것을 사용
		d.drive(taxi);
		

	}

}
