package part7.sec4.overriding;

public class ComRun {

	public static void main(String[] args) {
		Com c = new Com();
		System.out.println(c.areaCircle(5));
		System.out.println();
		Calc cl = new Calc();
		System.out.println(cl.areaCircle(5));

	}

}
