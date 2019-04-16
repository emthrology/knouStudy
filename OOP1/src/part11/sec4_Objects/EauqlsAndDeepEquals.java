package part11.sec4_Objects;

import java.util.Objects;

public class EauqlsAndDeepEquals {

	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		
		System.out.println(Objects.equals(o1, o2));
		//굳이 o1.equals(o2)를 안쓰는 이유 : 둘 다 매개값으로 둬서 쉽게 변경하기 위해
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, null)); // 이래도  true임
		
		System.out.println();
		
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		
		System.out.println(Objects.equals(arr1, arr2)); // 객체의 번지가 달라서 false
		System.out.println(Objects.deepEquals(arr1, arr2)); // 배열의 번지가 달라도 배열의 항목값들이 같다면 true
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(null, null)); //이거도 마찬가지로 true
	}
	
	

}
