package part12.thread.sec06.sleep;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i = 0; i<10; i++) {
			tk.beep();
			try {
				Thread.sleep(3000);
				//beep음 나고 3초 일시정지하는 작업 10번 반복
			} catch (InterruptedException e) {}
			
		}

	}

}
