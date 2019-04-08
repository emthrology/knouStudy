package part7.sec7.field_polimorphism;

public class CarRun {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i = 1;i<5;i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1: 
				System.out.println("앞왼쪽 한국타이어로 교체");
				car.frontLeftTire = new HankookTire("앞왼",15);
				break;
			case 2:
				System.out.println("앞오른쪽 금호타이어로 교체");
				car.frontRightTire = new KeumhoTire("앞오",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 한국타이어로 교체");
				car.frontLeftTire = new HankookTire("뒤왼",14);
				break;
			case 4:	
				System.out.println("뒤오른쪽 금호타이어로 교체");
				car.frontRightTire = new KeumhoTire("뒤오",17);
				break;
			}
			System.out.println("-------------------------");
		}
		

	}

}
