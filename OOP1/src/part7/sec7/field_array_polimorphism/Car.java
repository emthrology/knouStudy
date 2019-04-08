package part7.sec7.field_array_polimorphism;

public class Car {
	Tire[] tires = {
			new Tire("FL",6),
			new Tire("FR",2),
			new Tire("BL",3),
			new Tire("BR",4)
	};
	
	
	int run() {
		System.out.println("구른다");
		for(int i = 0;i<tires.length;i++) {
			if(tires[i].roll()==false) {
				stop();
				return i+1;
			}
		}
		return 0;
		
	}
	
	void stop() {
		System.out.println("멈춤");
	}
}
