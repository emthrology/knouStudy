package part12.thread.sec09_threadpool.blocking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableExample {

	public static void main(String[] args) {
		//스레드풀 설정
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()//실행가능한 cpu코어 갯수
		);	
		
		//로컬클래스 - 메인스레드에서 직접 하위 스레드 만들기 위해
		System.out.println("[작업 처리 요청]");
		class Task implements Runnable{
			Result result;
			Task(Result result) {
				this.result = result;
			}
			@Override
			public void run() {
				int sum = 0;
				for(int i =1; i<=10; i++) {
					sum += i;
				}
				result.addValue(sum);
			}
		};
		
		//---실행 스레드 본문이라고 할 수 있는 부분--//
		
		//공유 외부 객체 설정
		Result result = new Result();
		//두 개의 작업 정의 - 같은 공유객체 인스턴스를 매개변수로, sync처리되었음
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		Future<Result> future1 = executorService.submit(task1,result);
		Future<Result> future2 = executorService.submit(task2,result);
		
		try {
			
			result = future1.get();//task1의 작업만 누적 및 결과 나올 때까지 스레드 블로킹
			result = future2.get();//task2의 작업만 누적 및 결과 나올 때까지 스레드 블로킹
			//두 result는 공유객체로 따로 들어가서
			System.out.println("[처리결과]" + result.accumValue);
			//모든 스레드의 작업이 완료된 이후에 불러오기 때문에 빼먹은것이 없다
			System.out.println("[작업 처리 완료]");
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("[런타임 예외 발생]");
			e.printStackTrace();
		}

	}

}

//공유 외부객체의 VO : 스레드들이 결과값을 던지고, 그 값들을 합치는 외부객체의 VO(버퍼 역할)
class Result{
	int accumValue;
	synchronized void addValue(int value) {
		accumValue +=value;
	}
}
