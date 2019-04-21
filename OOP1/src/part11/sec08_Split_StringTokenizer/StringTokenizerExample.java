package part11.sec08_Split_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "홍/이/박";
		StringTokenizer st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
