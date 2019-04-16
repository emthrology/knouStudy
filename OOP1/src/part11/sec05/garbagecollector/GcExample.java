package part11.sec05.garbagecollector;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		//Employee(1)이 쓰래기 객체가 되었다
		emp = new Employee(2);
		emp = new Employee(3);
		//Employee(2)가 쓰래기 객체가 되었다
		
		System.out.print("emp가 최종적으로 참조하는 사원번호 : ");
		System.out.println(emp.eno);
		System.gc();
		//쓰래기 객체가 너무 많이 생성되면 성능저하가 일어나는데 이를 방지하기 위해 gc를 가동한다
		//그러므로 프로그램 끝날 때 가동하는 것이 아니라 프로그램 중간에 한번씩 가동하는것이 좋다

	}

}
