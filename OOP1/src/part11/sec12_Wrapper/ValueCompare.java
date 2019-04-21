package part11.sec12_Wrapper;

public class ValueCompare {

	public static void main(String[] args) {
		System.out.println("[-127~128 을 초과할 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("using '==' : " + (obj1==obj2));
		System.out.println("using '==' after unboxing process: " + (obj1.intValue()==obj2.intValue()));
		System.out.println("usig 'equals()' : " + (obj1.equals(obj2))); //Object의 equals()를 Wrapper에서 재정의한것
		
		System.out.println("[-127~128 범위 내인 경우]");
		Integer obj3 = 12;
		Integer obj4 = 12;
		System.out.println("using '==' : " + (obj3==obj4));//그래도 쓰지마
		System.out.println("usig 'equals()' : " + (obj3.equals(obj4)));

	}

}
