package part9.OverrapingClass.sec4_nestedinterface;

public class ButtonExam {

	public static void main(String[] args) {
		Button btn = new Button();
		
		//중첩 인터페이스를 생성해 기능을 구현한 예시
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		//익명구현객체를 이용해 기능을 구현한 예시
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다");
				
			}
		});
		btn.touch();

	}

}
