package part14lambda.sec05_Standard_APIs_using_Lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
		new Student("홍씨","남자",90),
		new Student("김씨","여자",80),
		new Student("박씨","남자",50),
		new Student("이씨","여자",95)
	);

	public static double avg(Predicate<Student> predicate) {//sex별로 평균 구하는 메소드 예제
		int count = 0;
		int sum = 0;
		for(Student student :list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		//남자 평균
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 :" + maleAvg);
		
		//여자 평균
		double femaleAvg = avg(t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 :" + femaleAvg);
	}

}
