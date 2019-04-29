package part12.thread.sec06.stop;

public class PrintThread1 extends Thread {
	private boolean stop; //stop flag

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) {
			System.out.println("작업중");
		}
		System.out.println("자원정리");
		System.out.println("작업 종료");
	}
	
	
}
