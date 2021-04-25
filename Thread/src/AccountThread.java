
public class AccountThread extends Thread {
	private Account act;

	public AccountThread(Account act) {
		super();
		this.act = act;
	}
	public void run() {
    double money=5000;
    act.withdraw(money);
    System.out.println("账户"+act.getActno()+"取款成功，余额"+act.getBalance());
	}
}
