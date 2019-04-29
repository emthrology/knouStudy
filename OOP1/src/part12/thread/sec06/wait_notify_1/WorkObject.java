package part12.thread.sec06.wait_notify_1;

public  class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA()작업 실행 중");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB()작업 실행 중");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}
