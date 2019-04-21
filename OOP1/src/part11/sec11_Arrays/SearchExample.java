package part11.sec11_Arrays;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("scores[index] = " + scores[index]);
		
		String[] names = {"홍길동","박동서","김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("names[index] = " + names[index]);
		
		Member m1 = new Member("홍");
		Member m2 = new Member("박");
		Member m3 = new Member("김");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);//사용자 정의 객체는 Comparable을 구현해야한다
		index = Arrays.binarySearch(members, m2);
		System.out.println("members[index] = " + members[index]);
	}

}
