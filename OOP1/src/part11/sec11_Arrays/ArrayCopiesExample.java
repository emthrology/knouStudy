package part11.sec11_Arrays;

import java.util.Arrays;

public class ArrayCopiesExample {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));//{J,A,V,A}
		
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));//{A,V}
		
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(char c : arr4) {
			System.out.print(c + " ");
		}
	}

}
