package part12.thread.sec06.wait_notify_2;

public class DataBox {
	private String data;

	public synchronized String getData() {
		//만약 data가 아직 없으면 대기상태로 전이
		if(this.data==null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		//생산자가 깨운 경우가 되겠지?
		String returnValue = data;
		System.out.println("ConsumerThread가 읽은 데이터 : " + returnValue);
		data = null;//소비자가 세마포어를 비우는 것이라 보면 됨
		notify();//공유객체(버퍼같은거) 비우고 생산자 
		return returnValue;
	}

	public synchronized void setData(String data) {
		//아직 소비자가 데이터를 안가져갔다면 대기상태로 전이 
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		this.data = data;//생산자가 세마포어를 채우는것이라 보면 됨
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify();//공유객체 채우고 소비자 콜
	}
	
	
}
