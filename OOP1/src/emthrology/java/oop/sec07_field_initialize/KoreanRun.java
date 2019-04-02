package emthrology.java.oop.sec07_field_initialize;

public class KoreanRun {

	public static void main(String[] args) {
		Korean k1 = new Korean("한국인", "000000-0000000");
		System.out.println("k1.nation : " + k1.nation);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		System.out.println();
		
		Korean k2 = new  Korean("한국인2", "111111-1111111");
		System.out.println("k2.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		
		/*k1.nation : 대한민국
		 *k1.name : 한국인
		 *k1.ssn : 000000-0000000
		 *
		 *k2.nation : 대한민국
		 *k2.name : 한국인2
		 *k2.ssn : 111111-1111111
		 *매개변수를 통해 객체를 초기화할수도있다
		 */
	}

}
