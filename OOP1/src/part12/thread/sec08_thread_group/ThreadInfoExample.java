package part12.thread.sec08_thread_group;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		
		ast.setName("AutoSaveThread");
		ast.setDaemon(true);
		ast.start();
		
		Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		for(Thread thread :threads) {
			System.out.println("thread name : " + thread.getName() + ((thread.isDaemon())?"(데몬 스레드)":"(주 스레드)"));
			System.out.println("\t" + "소속 그룹 : " + thread.getThreadGroup().getName());
			System.out.println();
		}
		/*
		 * console :
		 * thread name : AutoSaveThread(데몬 스레드)
		 *	소속 그룹 : main
		 *
		 * thread name : Reference Handler(데몬 스레드)
		 *	소속 그룹 : system
		 *
		 * thread name : Signal Dispatcher(데몬 스레드)
		 *	소속 그룹 : system
		 *
		 * thread name : main(주 스레드)
		 *	소속 그룹 : main
		 *
	  	 * thread name : Finalizer(데몬 스레드)
		 *	소속 그룹 : system
		 */
	}

}
