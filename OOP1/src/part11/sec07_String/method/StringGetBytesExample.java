package part11.sec07_String.method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";//한글은 한글자당 2바이트 먹는다
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);//UTF-8은 한글이 자당 3바이트
		
		String str1 = new String(bytes1);
		System.out.println("bytes1->str1 : " + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");//케릭터셋 오타나면 아래 예외 나옴
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			System.out.println("bytes2->str2 : " + str2);
			//맥은 디폴트가 UTF-8이니까 다른 방식으로 인코딩하면 디코딩할 때도 케릭터셋 명시해야한다
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
