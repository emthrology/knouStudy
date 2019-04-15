package part11.sec3.deepclone;

import java.util.Arrays;

public class Member1 implements Cloneable {
	private String name;
	private int age;
	private int[] scores;
	private Car car;
	
	public Member1(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	//깊은 복사 위한 override
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member1 cloned = (Member1) super.clone();//원본 clone을 호출하여 얕은 복사 실시
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.getModel());
		return cloned;
	}
	
	public Member1 getMember() {
		Member1 cloned = null;
		try {
			cloned = (Member1)clone();
		} catch (CloneNotSupportedException e) {}
		return cloned;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
	
}
