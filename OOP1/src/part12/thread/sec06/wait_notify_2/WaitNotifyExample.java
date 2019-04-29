package part12.thread.sec06.wait_notify_2;

public class WaitNotifyExample {

	public static void main(String[] args) {
		DataBox dBox = new DataBox();
		
		ProducerThread pt = new ProducerThread(dBox);
		ConsumerThread ct = new ConsumerThread(dBox);
		
		pt.start();
		ct.start();

	}

}
