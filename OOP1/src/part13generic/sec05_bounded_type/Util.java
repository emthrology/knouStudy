package part13generic.sec05_bounded_type;

public class Util {
	//Number의 자식클래스만 파라미터로 올 수 있는 메소드
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		//int result = (v1>v2?1:-1);
		return Double.compare(v1,v2);
	}
}
