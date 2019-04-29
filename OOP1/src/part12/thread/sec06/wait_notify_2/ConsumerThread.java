package part12.thread.sec06.wait_notify_2;

public class ConsumerThread extends Thread {
	private DataBox dBox;

	public ConsumerThread(DataBox dBox) {
		this.setName("ConsumerThread");
		this.dBox = dBox;
	}

	@Override
	public void run() {
		for(int i = 0; i<=3; i++) {
			String data = dBox.getData();
		}
	}
}
