package part12.thread.sec07_daemon.daemon;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		
		ast.setDaemon(true);
		ast.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		//예외발생 안한다면 5초 후 아래 메세지와 함께 main thread와 daemon thread 종료됨 
		System.out.println("메인 스레드 종료");

	}

}
