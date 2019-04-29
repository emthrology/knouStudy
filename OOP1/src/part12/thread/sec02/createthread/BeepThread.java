package part12.thread.sec02.createthread;

import java.awt.Toolkit;

public class BeepThread extends Thread{
	@Override
	public void run() {
		//비프음을5번 반복해서 소리하게 하는 작업
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0 ; i<5 ; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
