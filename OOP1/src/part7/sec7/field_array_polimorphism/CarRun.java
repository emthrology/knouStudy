package part7.sec7.field_array_polimorphism;

public class CarRun {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i = 1;i<5;i++) {
			int problemLocation = car.run();
			if(problemLocation !=0) {
				System.out.println(car.tires[problemLocation-1].location + "한국타이어로 교체");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("-------------------------");
		}
		

	}

}
