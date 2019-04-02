package emthrology.java.oop.sec08_method_declair;

public class CalcRun {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		//console : 전원을켭니다
		//stack에는 myCalc, heap에Calculator객체가 있다
		//myCalc에는 Calculator의 주소값이 담겨있다
		 
		int sum = myCalc.plus(3, 4);
		//sum :7
		
		byte x = 10;
		byte y = 4;
		double divide = myCalc.divide(x, y);//자동 형변환 2단계(byte ->int, int ->double)
		//divide : 2.5
				

	}

}
