package part11.sec3.toString;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		System.out.println(obj1);
		System.out.println(obj2);
//		java.lang.Object@7852e922 //obj1의 toStirng()리턴값
//		Mon Apr 15 23:41:58 KST 2019 //ojb2의 Date에서 재정의된 toString()리턴값


	}

}
