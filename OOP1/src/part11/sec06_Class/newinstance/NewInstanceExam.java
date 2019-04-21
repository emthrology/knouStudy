package part11.sec06_Class.newinstance;

public class NewInstanceExam {
	//동적 객체 생성 : 실행 도중 객체를 만들고 싶을 때 
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("part11.sec06_Class.newinstance.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.excute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
