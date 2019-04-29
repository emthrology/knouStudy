package part12.thread.sec08_thread_group;

public class ThreadGroupExample {

	public static void main(String[] args) {
		//main group밑에 myGroup생성
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main 스레드 그룹의 list() 메소드 출력 내용]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		/*
		 	console :
			[main 스레드 그룹의 list() 메소드 출력 내용]
					java.lang.ThreadGroup[name=main,maxpri=10]//maxpri = 최고 설정가능 우선순위
					    Thread[main,5,main]//5 = 현재 우선순위
					    java.lang.ThreadGroup[name=myGroup,maxpri=10]
					        Thread[workThreadA,5,myGroup]
					        Thread[workThreadB,5,myGroup]
		*/
		System.out.println();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		System.out.println("[myGroup 스레드 그룹의 interrupted() 메소드 호출]");
		myGroup.interrupt(); // 스레드 그룹을 사용하는 이유 : 한꺼번에, 안전하게 스레드를 종료하기 위해
		/*
			console :
			[myGroup 스레드 그룹의 interrupted() 메소드 호출]
					workThreadA interrupted
					workThreadB interrupted
					workThreadB종료됨
					workThreadA종료됨
		*/
	}

}
