package part12.thread.sec07_daemon.daemon;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업내용 자동저장");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
