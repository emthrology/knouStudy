package part12.thread.sec04._synchronized;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 u1 = new User1();
		u1.setCalculator(calculator);
		u1.start();
		
		User2 u2 = new User2();
		u2.setCalculator(calculator);
		u2.start();

	}

}
