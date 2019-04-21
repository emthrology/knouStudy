package part11.sec11_Arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		System.out.println();
		
		String[] names = {"홍길동","박동서","김민수"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));//가나다순 오름차순 
		
		Member m1 = new Member("홍");
		Member m2 = new Member("박");
		Member m3 = new Member("김");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);//사용자 정의 객체는 Comparable을 구현해야한다
		for(Member m :members) {
			System.out.print(m);
		}
		
		
	}

	

}
