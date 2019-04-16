package part11.sec05.garbagecollector;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee("+ eno + ")is generated into heap");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee("+ eno + ")is eliminated form heap");
	}
}
