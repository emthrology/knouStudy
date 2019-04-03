package emthrology.java.oop.sec9_instance_member;

public class CarRun {
	public static void main(String[] args) {
		Car car = new Car("포르쉐");
		Car car2 = new Car("현대");

		car.run();
		car2.run();
//		console:
//		포르쉐가 달린다
//		포르쉐가 달린다
//		포르쉐가 달린다
//		포르쉐가 달린다
//		포르쉐가 달린다
//		현대가 달린다
//		현대가 달린다
//		현대가 달린다
//		현대가 달린다
//		현대가 달린다
	}
	
}