package sec15.emthrology.java.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationRun {

	public static void main(String[] args) {
		Method[] declaredMethods = TestService.class.getDeclaredMethods();//TestService에 선언된 메소드들을 배열로 만들어서 정리
		for(Method method :declaredMethods) {//현재클래스(TestService)의 모든 메소드들에 대하여 반복하여 출력
			if(method.isAnnotationPresent(PrintAnnotation.class)) {//매개변수의 어노테이션이 적용되어있는지 물어보는 if문
				System.out.println(method.getName() + "에 PrintAnnotation.class가 적용되어 있음");
				PrintAnnotation printAnnotation =
						method.getAnnotation(PrintAnnotation.class);
				
//				System.out.println("value : " + printAnnotation.value());			//적용되어있는value 출력
//				System.out.println("number : " + printAnnotation.number() + "\n");	//적용되어있는number출력
				
				System.out.println("[" + method.getName() + "]");					//[메소드 이름] 출력
				for(int i = 0;i<printAnnotation.number();i++) {						//각 어노테이션마다 정해진 value와 number만큼 출
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					method.invoke(new TestService());								//TestService()가 갖고있는 각 메소드의 실행내용 출력
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println();
				
			}else {
				System.out.println(method.getName() + "에 PrintAnnotation.class가 적용되어있지 않음");
			}
			
			
		}

	}

}
