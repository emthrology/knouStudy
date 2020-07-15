package part12.thread.sec06.join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		
		try {
			st.join();//main Thread가 SumThread의 결과값을 기다림
		} catch (InterruptedException e) {}
		System.out.println("1~100의 합 : "+ st.getSum());

	}

}
