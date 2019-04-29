package part12.thread.sec05.state;

public class StatePrintThread extends Thread {
	//targetThread의 상태를 print해주는 Thread
	private Thread tergetThread;
	
	public StatePrintThread(Thread tergetThread) {
		this.tergetThread = tergetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = tergetThread.getState();
			//State =private static final[NEW,RUNNABLE,BLOCKED,WAITING,TIMED_WAITING,TERMINATED]
			System.out.println("타겟 스레드 상태 :" + state);
			if(state == Thread.State.NEW) {
				tergetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
	}
}
