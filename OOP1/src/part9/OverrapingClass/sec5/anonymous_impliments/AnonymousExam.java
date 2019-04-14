package part9.OverrapingClass.sec5.anonymous_impliments;

public class AnonymousExam {

	public static void main(String[] args) {
		Anonymous anno = new Anonymous();
		
		anno.field.turnOn();
		anno.field.turnOff();
		
		anno.method1();
		
		anno.method2(new RemoteControlable() {
			@Override
			public void turnOn() {
				System.out.println("SmartTV ON");

			}

			@Override
			public void turnOff() {
				System.out.println("SmartTv OFF");

			}

		});

	}

}
