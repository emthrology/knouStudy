package part12.thread.sec06.wait_notify_2;

public class ProducerThread extends Thread {
	private DataBox dBox;

	public ProducerThread(DataBox dBox) {
		this.setName("ProducerThread");
		this.dBox = dBox;
	}

	@Override
	public void run() {
		for(int i = 0; i<=3; i++) {
			String data = "Data-"+i;
			dBox.setData(data);
		}
	}
	
	
}
