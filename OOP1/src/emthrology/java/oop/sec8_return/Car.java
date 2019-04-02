package emthrology.java.oop.sec8_return;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas>0) {
			return true;
		}else {
			return false;
		}
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("running");
				System.out.println("gas left : " + gas);
				gas -=1;
			}else {
				System.out.println("stop");
				return;
			}
		}
	}
}
