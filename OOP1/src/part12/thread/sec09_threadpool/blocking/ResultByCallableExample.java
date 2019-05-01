package part12.thread.sec09_threadpool.blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//리턴값이 있는 작업 완료 통보 예제
public class ResultByCallableExample {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()//현재 프로그램을 실행하는 컴퓨터의 코어 갯수
		);
		
		System.out.println("[작업 처리 요쳥]");
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() {
				int sum = 0;
				for(int i = 0; i<=10; i++) {
					sum += i;
				}
				return sum;
			}
		};
		
		Future<Integer> future = es.submit(callable); 
		
		try {
			//결과 나올때까지 block해줌
			int result = future.get();//오토 언박싱
			System.out.println("[처리결과] "+result);
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
