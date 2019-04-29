package part12.thread.sec02.createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		//how 1 : 직접 BeepTask를 호출
		/*
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		*/
		
		//how 2 : Runnable 인턴페이스의 익명구현객체 만들기
		/*
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				//비프음을5번 반복해서 소리하게 하는 작업
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0 ; i<5 ; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch (Exception e) {}
				}
			}
		});
		thread.start();
		*/
		
		//how 3 : using lambda(new Runnable()과 {run()}의 '이름' 생략하고 '->'추가 )
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0 ; i<5 ; i++) {
				toolkit.beep();
				try {Thread.sleep(500);} catch (Exception e) {}
			}
		});
		thread.start();
		
		//"띵" 문자열을 5번 출력하는 작업
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
		
		//싱글 스레드에서는 두 작업이 동시에 이루어질 수 없다
	}

}
