package part12.thread.sec03.priority;

public class PrioityExample {

	public static void main(String[] args) {
		for(int i = 1;i<=10 ;i++) {
			Thread thread = new CalcThread("Thread"+i);
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
			//원래는 Thread10이 제일 먼저 출력되어야함. 
		}

	}

}
