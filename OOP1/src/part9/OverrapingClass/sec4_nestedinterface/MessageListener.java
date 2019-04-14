package part9.OverrapingClass.sec4_nestedinterface;

import part9.OverrapingClass.sec4_nestedinterface.Button.OnClickListener;

public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지 보냅니다 ");
		
	}
	
}
