package part11.sec05.exit;

public class ExitExample {

	public static void main(String[] args) {
		//System클래스에 소속된 setSecurityManager메소드의 매개변수에 익명(인스턴스변수 없는) 자식객체 재정의
		System.setSecurityManager(new SecurityManager() {
			
			//5가 입력되지 않은 경우 예외발생하도록 재정의
			@Override
			public void checkExit(int status) {
				if(status!=5) {
					throw new SecurityException();
				}
			}
			
		});
		
		
		for(int i =0;i<10;i++) {
			System.out.println(i);
			
			try {
			System.exit(i);
			}catch(SecurityException e) {}
			//System.exit()가 실행될 때 5가 아니면 예외 발생하는데 
			//catch에서 아무것도 적지 않았으므로 for에서 계속 진행
		}

	}

}
