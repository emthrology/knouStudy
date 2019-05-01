package part12.thread.sec09_threadpool.blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		//컴플리션 서비스 생성자 호출
		CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(es);
		
		System.out.println("[작업 처리 요청]");
		
		for(int i = 0; i<3; i++) {//작업스레드 풀에서 스레드 3개 생성
			cs.submit(new Callable<Integer>() {//callable로 생성했으므로 제네릭타입, 리턴값 필요

				@Override
				public Integer call() throws Exception {//각각의 작업스레드에서 실행할 내용
					int sum = 0;
					for(int i = 1; i<=10; i++) {
						sum += i;
					}
					return sum;
				}
				
			});
		}//for ends
		
		//여기가 이 예제의 핵심
		//중요 : 각각의 작업스레드들이 들어간 순서대로 끝난다는 보장이 없다
		//--> 완료된 작업을 먼저 받는 로직이 필요하다
		
		System.out.println("[처리 완료된 작업 확인]");
		//다른 스레드풀을 만들어서 확인하는 이유 : 블로킹되면 작업완료까지 아무 작업도 할 수 없기 때문
		es.submit(new Runnable() {
			@Override
			public void run() {
				while(true) {//take() 하나가 끝나면 새로운 take()를 다시 불러서 다른 작업스레드 작업처리완료 대기
					try {
						Future<Integer> future =  cs.take();//작업완료전까지 블로킹해줌 , 완료된 작업이 있을 때 완료 처리
						int value = future.get();
						//take()가 작업완료시까지 블로킹해주기 때문에 get()에서는 블로킹 할 처리중인 작업이 없고 바로 나옴
						System.out.println("[처리 결과]" + value);
					} catch (Exception e) {
						break;
					}
				}
				
				
			}
		});
		
		Thread.sleep(3000);//작업스레드들이 작업완료하기도 전에 메인스레드가 완료되는 것을 방지
		
		es.shutdownNow();//작업 스레드풀 종료

	}

}
