package part11.sec07_String.method;

public class StringCharAtExample {

	public static void main(String[] args) {
		String strVar1 = new String("abc");
		String strVar2 = "abc";
		String strVar3 = "abc";
		
		//첫번째 조건식은 객체 비교(new로 생성된 객체는 내용이 같아도 주소가 달라진다, strVar2 와 strVar3은 같은 주소를 가질것이다)
		//두번째 조건식은 객체의 값을 직접 비교
		if(strVar1 == strVar2) {
			System.out.println("using Same Object");
		} else {
			System.out.println("using Other Object");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("same String value");
		} else {
			System.out.println("differnt String value");
		}

	}

}
