package part14lambda.sec05_Standard_APIs_using_Lambda.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
		new Student("홍씨",82,34),
		new Student("김씨",43,67)
	);
	
	
	public static double printAvg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student: list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double)sum/ list.size();
		return avg;
	}
	
	
	public static void main(String[] args) {
		double engAvg = printAvg(t -> t.getEngScore());
		System.out.println("영어 평균 : " + engAvg);
		
		double mathAvg = printAvg(t -> t.getMathScore());
		System.out.println("수학 평균 : " + mathAvg);
	}

}
