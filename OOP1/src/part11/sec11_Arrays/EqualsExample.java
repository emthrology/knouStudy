package part11.sec11_Arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		int[][] original = {{1,2},{3,4}};
		
		//얕은 복사 후 비교-->원본배열 원소 heap의 주소값만 복사-->두 배열은 같은 주소값들을 참조하고 있다
		System.out.println("얕은복사 후 비교");
		int[][] clone1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 자체의 주소 비교-original.equals(clone1) :" + original.equals(clone1));
		System.out.println("배열 안 객체의 주소 비교-Arrays.equals(original,clone1) : " 
		+ Arrays.equals(original, clone1));
		System.out.println("배열 안 객체의 자료값이 일치하는 비교-Arrays.deepEquals(original,clone1) : " 
				+ Arrays.deepEquals(original, clone1));
		
		//깊은 복사후 비교-->원본배열의 내용을 복사하여 새 배열의 새 주소값에 할당-->두 배열은 다른 주소값을 참조한다
		System.out.println("깊은복사 후 비교");
		int[][] clone2 = Arrays.copyOf(original, original.length);
		for(int i = 0; i<original.length; i++) {
			clone2[i] = Arrays.copyOf(original[i], original[i].length);
		}
		System.out.println("배열 자체의 주소 비교-original.equals(clone2) :" + original.equals(clone2));
		System.out.println("배열 안 객체의 주소 비교-Arrays.equals(original,clone2) : " 
		+ Arrays.equals(original, clone2));//false - 당연히 새로 할당한 거니까
		System.out.println("배열 안 객체의 자료값이 일치하는 비교-Arrays.deepEquals(original,clone2) : " 
				+ Arrays.deepEquals(original, clone2));
		
		//간단히 생각해보면
		//Arrays.equals()은 1차배열의 값을 비교하고
		//Arrays.deepEquals()은 2차배열의 값을 비교하는것
	}

}
