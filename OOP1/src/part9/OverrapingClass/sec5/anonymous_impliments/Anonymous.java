package part9.OverrapingClass.sec5.anonymous_impliments;

public class Anonymous {
	RemoteControlable field = new RemoteControlable() {

		@Override
		public void turnOn() {
			System.out.println("TV ON");
			
		}

		@Override
		public void turnOff() {
			System.out.println("TV OFF");
			
		}
		
	};
	
	void method1() {
		RemoteControlable localVar = new RemoteControlable() {

			@Override
			public void turnOn() {
				System.out.println("audio ON");
				
			}

			@Override
			public void turnOff() {
				System.out.println("audio OFF");
				
			}
			
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(RemoteControlable rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
