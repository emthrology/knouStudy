package part11.sec07_String.method;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 자바";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(oldStr);//안바뀜
		System.out.println(newStr);//새 객체를 만들어서 리턴하는거임

	}

}
