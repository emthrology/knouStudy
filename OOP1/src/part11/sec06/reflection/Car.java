package part11.sec06.reflection;

public class Car {
	private String model;
	private String owner;
	
	public Car() {
		
	}
	
	public Car(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	private void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
