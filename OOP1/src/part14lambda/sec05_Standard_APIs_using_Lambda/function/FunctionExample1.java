package part14lambda.sec05_Standard_APIs_using_Lambda.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
		new Student("홍씨",80,30),
		new Student("김씨",40,60)
	);
	
	public static void printString(Function<Student,String> function) {
		for(Student student: list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student: list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		System.out.println("[학생이름]");
		printString(t -> t.getName());
		System.out.println("[영어점수]");
		printInt(t -> t.getEngScore());
		System.out.println("[수학점수]");
		printInt(t -> t.getMathScore());
	}

}
