package part11.sec15_format.deimalFormat;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String id = "java";
		String name = "abc";
		String tel = "010-1111-2222";
		
		String text = ("회원 아이디 : {0}\n회원 이름 : {1}\n회원 전화 : {2}");
		String result1 = MessageFormat.format(text, id,name,tel);
		System.out.println(result1);
		
		System.out.println();
		
		String sql = "insert into member values({0},{1},{2})";
		Object[] arguments = {"java","abc","010-1111-2222"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);

	}

}
