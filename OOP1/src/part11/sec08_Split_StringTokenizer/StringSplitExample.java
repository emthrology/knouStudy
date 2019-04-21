package part11.sec08_Split_StringTokenizer;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍&이,박,김-최";
		String[] familynames = text.split("&|,|-");
		for(String familyname : familynames)
		System.out.println(familyname);
	}

}
 