package part13generic.sec04.generic_method2;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer,String> p1 = new Pair<>(1,"사과");
		Pair<Integer,String> p2 = new Pair<>(1,"배");
		
		boolean compareResult1 = Util.<Integer,String>compare(p1, p2);
		if(compareResult1) {
			System.out.println("논리적 동치인 객체들");
		}else {
			System.out.println("논리적 동치가 아닌 객체들");
		}
		
		
		Pair<String,String> p3 = new Pair<>("user1","sameName");
		Pair<String,String> p4 = new Pair<>("user2","sameName");
		
		boolean compareResult2 = Util.compare(p3, p4); //p3,p4에 들어오는 파라미터 타입을 보고 유추해서 메소드에 적용
		if(compareResult2) {
			System.out.println("논리적 동치인 객체들");
		}else {
			System.out.println("논리적 동치가 아닌 객체들");
		}

	}

}
