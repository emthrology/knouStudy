package part11.sec07_String.constructor;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) {
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = 0;
		try {
			readByteNo = System.in.read(bytes);
			String str = new String(bytes, 0, readByteNo-1);//윈도우면 -2해야함 (\r\n이니까)
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
