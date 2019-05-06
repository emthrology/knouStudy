package part13generic.sec04.generic_method2;

public class Util {
	public static <K,V> boolean compare(Pair<K,V> p1,Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare && valueCompare; // 두 boolean의 논리곱 - 둘 중 하나라도 false이면 결과값은 false
	}
}
