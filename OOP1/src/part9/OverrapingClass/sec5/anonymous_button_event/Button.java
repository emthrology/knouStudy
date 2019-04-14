package part9.OverrapingClass.sec5.anonymous_button_event;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	
	interface OnClickListener {
		void onClick();
	}
	
	//실행클래스에서 쓸 메소드는 setter와 touch()이다
	//setter 가 실행되면 인터페이스 OnClickListener타입의 listener 객체가 만들어지고 setter를 사용해 listener값을 저장한다
	//listener를 바탕으로 touch()가 실행가능해진다
	
}
