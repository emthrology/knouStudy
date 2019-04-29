package part12.thread.sec06.yield;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업중");
			}else {
				Thread.yield();//양보
			}
		}
		System.out.println("ThreadA 종료");
	}
	
}
