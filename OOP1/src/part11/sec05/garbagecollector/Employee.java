package part11.sec05.garbagecollector;

public class Employee {
	public int eno;
	Class<? extends Employee> clazz = this.getClass();
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee("+ eno + ")is generated into heap");
		System.err.println(clazz.getName());
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee("+ eno + ")is eliminated form heap");
		System.err.println(clazz.hashCode());
	}
}
