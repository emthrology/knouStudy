package part14lambda.sec05_Standard_APIs_using_Lambda.operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = {92, 95, 87,73,33,36,85};
	
	public static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];//이건 초기값이고
		for(int score: scores) {
			result = oper.applyAsInt(result, score); // 여기서 종종 바뀐다
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값
		int max = maxOrMin(
			(a,b) -> {
				if(a>=b) return a;
				else return b;
			}
		);		
		System.out.println(max);
		
		//최소값
		int min = maxOrMin(
			(a,b) -> {
				if(a>=b) return b;
				else return a;
			}
		);
		System.out.println(min);
	}

}
