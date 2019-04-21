package part11.sec04_Objects;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "ASDFA";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2)); //return null
		System.out.println();
		
		System.out.println(Objects.toString(str2, "이름이 없음")); //null대신 오른쪽 문자열 리턴
		
	}

}
