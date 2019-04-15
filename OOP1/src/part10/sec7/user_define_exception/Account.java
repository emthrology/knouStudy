package part10.sec7.user_define_exception;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientExecption {
		if(balance<money) {
			throw new BalanceInsufficientExecption("잔고부족:" + (balance-money));
		}
		balance -=money;
	}
}
