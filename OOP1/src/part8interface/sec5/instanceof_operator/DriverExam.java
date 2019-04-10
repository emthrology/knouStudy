package part8interface.sec5.instanceof_operator;

public class DriverExam {

	public static void main(String[] args) {
		Driver d = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//인터페이스 타입에 구현객체들을 집어넣는 코드
		d.drive(bus);
		d.drive(taxi);

	}

}
  