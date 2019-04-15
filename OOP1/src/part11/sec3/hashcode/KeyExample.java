package part11.sec3.hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hm = new HashMap<Key, String>();
		
		hm.put(new Key(1), "김동민");
		String value = hm.get(new Key(1));
		System.out.println(value);
		//line 9의 put할 때 Key와 line 10의 get 할 때 Key가 서로 다르다고 보는 것이다
		//(new 가 각각 선언되었으니까 각각의 hashcode가 다른 것)
		
//		원래대로라면 new 로 생성한 객체는 당연히 주소가 달라야하는데 
//		hashCode()를 오버라이딩해서 객체주소가 아닌 객체에 입력된 값을 리턴하도 재정의

	}

}
