package part9.OverrapingClass.sec4_nestedinterface;

import part9.OverrapingClass.sec4_nestedinterface.Button.OnClickListener;

public class CallListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화 겁니다 ");
		
	}
	
}
