package part12.thread.sec09_threadpool.blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()//현재 프로그램을 실행하는 컴퓨터의 코어 갯수
		);
		
		System.out.println("[작업 처리 요쳥]");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i = 0; i<=10; i++) {
					sum += i;
				}
				System.out.println("[처리 결과]" + sum);
			}
		};
		
		Future future = es.submit(runnable); 
		
		try {
			//결과 나올때까지 block해주는 역할
			future.get();
			System.out.println("[작업 처리 완료]");
		} catch (InterruptedException e) {
			System.out.print("[예외 발생]");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.print("[예외 발생]");
			e.printStackTrace();
		}
		
		es.shutdown();
	}

}
