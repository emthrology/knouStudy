package part14lambda.sec05_Standard_APIs_using_Lambda.rannable;

public class RunnableExample {

	public static void main(String[] args) {
		//how 1
		/*
		Runnable runnable = () -> {
			for(int i = 0; i<10; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		*/
		
		//how 2 -- 더 자주쓰는 방법
		Thread thread = new Thread(()->{
			for(int i = 0; i<10; i++) {
				System.out.println(i);
			}
		});
		thread.start();
	}

}
