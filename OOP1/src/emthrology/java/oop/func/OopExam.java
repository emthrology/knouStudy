package emthrology.java.oop.func;

public class OopExam {
	//필드 :클래스변수 선언하는곳, 객체의 데이터가 저장되는 곳
	int fieldName;
	//생성자 : 객체 생성시 초기화 역할 담당,리턴타입이 없으며,반드시 클래스이름과 같아야 한다
	OopExam() {
		super();
	}
	//메소드 : 객체의 동작에 해당하는 실행 블록
	public void methodName() {
		//메소드 본체 입력...
	}
	//new 연산자는 객체를 생성한 후 객체생성주소를 리턴한다(객체는 heap에 생성된다)
	//객체의 이름과 주소는 stack에 저장된다
	
	//클래스의 용도 : 라이브러리 - 다른 클래스에서 이용할목적으로 만든 클래스 / 실행용 main class
	//애플리케이션 : 1개의 실행 클래스와 n개의 라이브러리
	
	
}

//하나의 소스파일에는 하나의 클래스를 만드는 것이 관례, 두 개 이상의 클래스도 선언은 가능하다
class OtherClass {
	
} 