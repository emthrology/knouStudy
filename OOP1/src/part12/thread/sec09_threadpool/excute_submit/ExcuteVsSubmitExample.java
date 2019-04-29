package part12.thread.sec09_threadpool.excute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteVsSubmitExample {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		for(int i = 0; i<10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					String threadName = Thread.currentThread().getName();
					ThreadPoolExecutor tpe = (ThreadPoolExecutor)es;
					int poolSize = tpe.getPoolSize();
					System.out.println("작업 처리 by " + threadName);
					System.out.println("총 스레드 개수 : " + poolSize);
					int value = Integer.parseInt("not number-string");//예외발생 유발 코드 
					//execute()는 예외발생시 해당 스레드를 종료시키고, 풀에서 제거한 후 새 스레드를 풀에 생성 
					//submit()은 예외 발생하더라도 스레드가 종료되지 않고 다음 작업을 위해 재사용
				}
			};
			
//			es.execute(runnable);
			es.submit(runnable);
			Thread.sleep(10);
		}
		
		
		es.shutdown();

	}

}
