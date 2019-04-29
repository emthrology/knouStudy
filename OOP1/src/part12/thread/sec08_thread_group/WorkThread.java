package part12.thread.sec08_thread_group;

public class WorkThread extends Thread {
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup,threadName);
//	'super()'(Thread's constructor, one of)의 구조 : init부터 보면 됨	
//	public Thread(ThreadGroup group, String name) {
//        	init(group, null, name, 0);
//  }
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);//일시정지상태로 전이시켜 interruptedException의 조건 만족시키기 위함
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted");
				break;
			}
			
		}
		System.out.println(getName() + "종료됨");
	}
}
