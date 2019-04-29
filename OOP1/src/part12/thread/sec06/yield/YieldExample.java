package part12.thread.sec06.yield;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		tA.start();
		tB.start();
		
		try {
			Thread.sleep(3000);//main thread가 3초 쉼
		} catch (InterruptedException e) {}
		tA.work=false;
		
		try {
			Thread.sleep(3000);//main thread가 3초 쉼
		} catch (InterruptedException e) {}
		tA.work=true;//ThreadA의 .yield()발동 ->ThreadB만 작동함
		
		tA.stop = true;
		tB.stop = true;
	}

}
