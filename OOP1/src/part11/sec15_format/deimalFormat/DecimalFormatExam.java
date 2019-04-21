package part11.sec15_format.deimalFormat;

import java.text.DecimalFormat;

public class DecimalFormatExam {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");//반올림
		System.out.println(df.format(num));

		df = new DecimalFormat("0000000000000.0000");//제로확장O
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#############.####");//제로확장X
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");//세자리마다 쉼표
		System.out.println(df.format(num));
	}

}