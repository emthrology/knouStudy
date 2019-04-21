package part11.sec07_String.method;

public class StringTrimExample {

	public static void main(String[] args) {
		// str.trim()은 중간 여백은 놔두고 문자열 앞 뒤의 여백만 자른다
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "   1234    ";
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
