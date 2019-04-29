package part12.thread.sec06.stop;

public class PrintThread2 extends Thread {

	@Override
	public void run() {
		//1.일시정지구간을 만들어 interrupt() 가능한 조건 만들기 - 안좋은 코
//		try {
//			while (true) {
//				System.out.println("작업중");
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException e) {}
		
		//2.일시정지구간 없이 스레드 종료
		while (true) {
			System.out.println("작업중");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("자원정리");
		System.out.println("작업 종료");
	}

}
