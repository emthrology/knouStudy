package emthrology.java.oop.sec07_constructor_call;

public class ExExam {

	public static void main(String[] args) {
		Ex ex1 = new Ex();
		System.out.println("ex1.compnay : " + ex1.company);
		System.out.println("ex1.model : " 	+ ex1.model);
		System.out.println("ex1.color : " 	+ ex1.color);
		System.out.println("ex1.maxSped : " + ex1.maxSpeed);
		
		Ex ex2 = new Ex("세단");
		System.out.println("ex2.compnay : " + ex2.company);
		System.out.println("ex2.model : " 	+ ex2.model);
		System.out.println("ex2.color : "	+ ex2.color);
		System.out.println("ex2.maxSped : " + ex2.maxSpeed);
		
		Ex ex3 = new Ex("세단","검정");
		System.out.println("ex3.compnay : " + ex3.company);
		System.out.println("ex3.model : " 	+ ex3.model);
		System.out.println("ex3.color : " 	+ ex3.color);
		System.out.println("ex3.maxSped : " + ex3.maxSpeed);

	}

}
