package part11.sec09_StringBuilder_StringBuffer;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, 2);
		System.out.println(sb.toString());//'a0''b1''c2'' 3'"2가 4번째 자리에 들어온다"
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		sb.replace(5, 12, "book");
		System.out.println(sb.toString());
		sb.delete(4, 5);
		System.out.println(sb.toString());//'6' 삭제
		
		System.out.println("sb.length() : " + sb.length());
		
		//StringBuilder, StringBuffer는 같은 객체 안의 값을 직접 수정한다
		String result = sb.toString();
		System.out.println(result);//sb.toString() at line 9 의 내용이 변한 것이 result임을 알 수 있다
		
	}

}
