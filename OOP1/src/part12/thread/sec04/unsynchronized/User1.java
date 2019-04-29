package part12.thread.sec04.unsynchronized;

public class User1 extends Thread{
	private Calculator calculator;//공유객체 생성

	public void setCalculator(Calculator calculator) {
		this.setName("User1");//쓰레드 이름 지어주기
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
	
}
