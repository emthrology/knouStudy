package part12.thread.sec04.unsynchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		//현재 '메모리'를 다루고 있는 쓰레드 이름 표시(확인용)
		System.out.println(Thread.currentThread().getName() + ": "+this.memory);
	}
	
	
}
