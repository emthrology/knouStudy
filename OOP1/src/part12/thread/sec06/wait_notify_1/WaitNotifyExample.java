package part12.thread.sec06.wait_notify_1;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject sharedWo = new WorkObject();
		
		ThreadA tA = new ThreadA(sharedWo);
		ThreadB tB = new ThreadB(sharedWo);
		
		//원래는 tA가 먼저 다 실행되고 tB가 실행되는데 이걸번갈아 실행하기위해서(내용이 반복문들이다)
		//각 객체의 원본에 notify()와 wait()를 심고 sync처리 했다 (WorkObject.java 참조)
		tA.start();
		tB.start();
		

	}

}
