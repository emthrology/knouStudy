package part12.thread.sec05.state;

public class ThreadStateExample {

	public static void main(String[] args) {
		StatePrintThread spt = new StatePrintThread(new TargetThread());//매개변수 들어가는 방식에 주의
		spt.start();
		
	}

}
