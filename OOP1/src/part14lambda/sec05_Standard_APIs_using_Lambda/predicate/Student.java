package part14lambda.sec05_Standard_APIs_using_Lambda.predicate;

public class Student {
	private String name;
	private String sex;
	private int score;
	
	public Student(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}
	
	
	
}
