package part10.sec7.user_define_exception;

public class BalanceInsufficientExecption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6489030723679183207L;
	public BalanceInsufficientExecption() {}
	public BalanceInsufficientExecption(String message) {
		super(message);
	}
}
