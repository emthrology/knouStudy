package part12.thread.sec02.threadname;

public class ThreadB extends Thread {
	@Override
	public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용"); //getName() : Thread-0 (default value)
		}
	}
}
