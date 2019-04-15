package part10.sec7.user_define_exception;

public class BalanceInsufficientExecption extends Exception {
	public BalanceInsufficientExecption() {}
	public BalanceInsufficientExecption(String message) {
		super(message);
	}
}
