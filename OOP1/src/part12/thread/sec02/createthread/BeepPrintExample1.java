package part12.thread.sec02.createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		//비프음을5번 반복해서 소리하게 하는 작업
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0 ; i<5 ; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch (Exception e) {}
		}
		
		//"띵" 문자열을 5번 출력하는 작업
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
		
		//싱글 스레드에서는 두 작업이 동시에 이루어질 수 없다
	}

}
