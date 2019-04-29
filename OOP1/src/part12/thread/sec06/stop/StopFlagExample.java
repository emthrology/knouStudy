package part12.thread.sec06.stop;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 pT = new PrintThread1();
		pT.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		pT.setStop(true);

	}

}
