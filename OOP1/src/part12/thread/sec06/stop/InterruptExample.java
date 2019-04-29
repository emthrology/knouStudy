package part12.thread.sec06.stop;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		//main thread를 1초 재우고 (그 와중에 PrintThread2는 열심히 작업중)
		//그 뒤 PrintThread2를 interrupt()처리 하겠다는 구조
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		thread.interrupt();

	}

}
