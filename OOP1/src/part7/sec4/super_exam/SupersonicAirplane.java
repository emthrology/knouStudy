package part7.sec4.super_exam;

public class SupersonicAirplane extends Airplane{
	
	@Override
	public void fly() {
		super.fly();//fly에서 부모메서드의 부분 갖고옴(은닉화 해제)
		System.out.println("초음속 비행으로 변경");
		System.out.println("초음속 비행중");
		setSpeed("300");
		System.out.println("current speed : "  + getSpeed());
		
	}
	

	
	
}
