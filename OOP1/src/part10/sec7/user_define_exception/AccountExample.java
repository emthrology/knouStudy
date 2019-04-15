package part10.sec7.user_define_exception;

public class AccountExample {
	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.deposit(10000);
		System.out.println("current :" + acc.getBalance());
		try {
			acc.withdraw(11000);
		} catch (BalanceInsufficientExecption e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
			System.out.println();
			System.out.println(e.toString());
		}
	}
}
